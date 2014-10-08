package softwareAnalysis;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
	
	public static void main(String args[]){
		
		String junk;
		int teamSize = -1;
		int time = -1; 
		int modules = -1;
		ArrayList<Module> modList = new ArrayList<Module>();
		
		Scanner scanner = new Scanner(System.in);
		
		/**
		 * How big will the team be?
		 */
		System.out.println("Please enter the number of Team Members involved in the project:\n");
		while(teamSize==-1) {
			if(scanner.hasNextInt())
				teamSize = Integer.parseInt(scanner.next());
			else
				junk = scanner.next();
		}
		
		/**
		 * how many days will the project be expected to take?
		 */
		System.out.println("Please enter the number of days to finish the project:\n");
		while(time==-1) {
			if(scanner.hasNextInt())
				time = Integer.parseInt(scanner.next());
			else
				junk = scanner.next();
		}
		
		/**
		 * how many modules are expected for this project?
		 */
		System.out.println("Please enter the number of expected modules:\n");
		while(modules==-1)
		{
			if(scanner.hasNextInt())
				modules=Integer.parseInt(scanner.next());
			else 
				junk = scanner.next();
		}
		
		/**
		 * Add the modules
		 */
		for(int i=0;i<modules;i++)
		{
			System.out.println("What is the name of Module "+i+"?\n");
			junk = scanner.nextLine();
			String modName = scanner.nextLine();
			System.out.println("What is the expected source lines of code for this module?\n");
			int sloc = -1;
			while(sloc==-1)
			{
				if(scanner.hasNextInt())
					sloc=Integer.parseInt(scanner.next());
				else 
					junk = scanner.next();
			}
			Module m = new Module(modName, 1, sloc, null); //TODO change these to take in lists of files
			modList.add(m);
		}
	
		System.out.println("Teamsize is "+teamSize);
		System.out.println("Estimated time is "+time);
		System.out.println("Estimated number of modules is "+modules);
		System.out.print("Modules are " );
		for(int i=0;i<modList.size();i++)
		{
			String pretty;
			if(i<modList.size()-1)
				pretty = ", ";
			else
				pretty = "\n ";
			System.out.print(modList.get(i).name+pretty);
		}
		System.out.println("\n");
	}

}
