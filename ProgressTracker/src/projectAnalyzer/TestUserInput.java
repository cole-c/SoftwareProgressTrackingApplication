package projectAnalyzer;

public class TestUserInput {

	public static void main(String[] args) {
		UserInput ui = new UserInput();
		System.out.println("Now testing UserInput module\n");
		int numDevs = 4;
		System.out.println("Number of developers: " + numDevs);
		int loc = 3500;
		System.out.println("Number of lines of code: " + loc);
		int numMeth = 39;
		System.out.println("Number of methods:: " + numMeth);
		int skillOfDevs = 7;
		System.out.println("Skill of developers (out of 10): " +skillOfDevs);
		System.out.println("Please wait....");
		ui.projectAnalyzer(numDevs, loc, numMeth, skillOfDevs);
		System.out.println("Estimated complexity: " + ui.getEstimatedComplexity());
		System.out.println("Estimated number of weeks: " + ui.getEstimatedNumberOfWeeks());
		int expectedNumWeeks = 14;
		if (Math.abs(expectedNumWeeks - ui.getEstimatedNumberOfWeeks()) < 3) {
			System.out.println("\n**** SUCCESS - estimate is within expected range ****\n");
		} else {
			System.out.println("\n**** FAILURE - estimate exceeds expeced range ****\n");
		}

		System.out.println("UserInput module testing now complete");
	}
	
}
