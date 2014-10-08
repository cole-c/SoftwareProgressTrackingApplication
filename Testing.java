
import org.junit.Test;
import org.junit.Assert.*;
import org.junit.Before;



public class Testing
{
	
	String filePath = "./myFile.java";
	MethodCounter methodCounter;
	LineCounter lineCounter;
	ChangeCounter changeCounter;
	
	
	
	@Before
	public void Setup()
	{
		//TODO
		methodCounter = new MethodCounter();
		lineCounter = new LineCounter();
		changeCounter = new ChangeCounter();
	}
	
	/*
	 * This tests the method counting functionality.
	 */
	@Test
	public void NumMethodsTest()
	{
		//Do some stuff
		
		
		//Asserts
		assertEquals("The number of methods in the file was incorrect.", methodCounter.parseFile(filePath), 45);
	}
	
	/*
	 * This tests the line counting functionality.
	 */
	@Test
	public void NumLinesTest()
	{
		//Do some stuff
		
		
		//Asserts
		assertEquals("The number of lines was incorrect.", lineCounter.getNumLines(filePath), 225);
	}
	
	/*
	 * This tests the change count functionality.
	 */
	@Test
	public void NumChangesTest()
	{
		//Do some stuff
		
		
		//Asserts
		assertEquals("The number of changes was incorrect.", changeCounter.getNumchanges(filePath), 78);
	}
	
}
