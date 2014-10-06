package softwareAnalysis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;


public class MethodCount {

/**
 * Parse java program in given file path
 * @param filePath
 * @throws IOException 
 */
public void parseFile(String filePath) throws IOException {
    try {
    	System.out.println("Starting to parse " + filePath);
    	File javaFile = new File(filePath);
    	BufferedReader in;
		in = new BufferedReader(new FileReader(javaFile));
		final StringBuffer buffer = new StringBuffer();
		String line = null;
		while (null != (line = in.readLine())) {
			buffer.append(line).append("\n");
		}
		ASTParser parser = ASTParser.newParser(AST.JLS4);
		parser.setKind(ASTParser.K_COMPILATION_UNIT);
		parser.setSource(buffer.toString().toCharArray());
		parser.setResolveBindings(true);
		CompilationUnit cu = (CompilationUnit) parser.createAST(null);
    
		in.close();
		
		cu.accept(new ASTVisitor() {

        @Override
        public boolean visit(MethodDeclaration node) {
            return true;
        }

        @Override
        public void endVisit(MethodDeclaration node) {
            System.out.println("Method " + node.getName().getFullyQualifiedName() + " is visited");
        }

    });
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
}