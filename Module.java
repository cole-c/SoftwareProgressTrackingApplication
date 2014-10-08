package softwareAnalysis;

import java.io.File;
import java.util.ArrayList;

public class Module {
	
	String name;
	int numberOfMethods;
	int SLoC;
	ArrayList<File> associatedFiles; 
	
	public Module(String name, int numberOfMethods, int SLOC, ArrayList<File> associatedFiles)
	{
		this.name = name;
		this.numberOfMethods = numberOfMethods;
		this.SLoC = SLOC;
		this.associatedFiles = associatedFiles;
	}

	public ArrayList<File> getAssociatedFiles() {
		return associatedFiles;
	}
	
	public void setAssociatedFiles(ArrayList<File> associatedFiles) {
		this.associatedFiles = associatedFiles;
	}
}
