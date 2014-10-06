package projectAnalyzer;
import java.util.Random;;

public class UserInput {
	
	private int numberOfDevelopers = 0;
	private int linesOfCode = 0;
	private int numberOfMethods = 0;
	private int estimatedNumberOfWeeks = 0;
	private int estimatedComplexity = 0;
	
	public void projectAnalyzer(int numberOfDevelopers, int linesOfCode, int numberOfMethods) {
		this.numberOfDevelopers = numberOfDevelopers;
		this.linesOfCode = linesOfCode;
		this.numberOfMethods = numberOfMethods;
		
		Random rand = new Random();
		this.estimatedComplexity = rand.nextInt() % 5;
		
		this.estimatedNumberOfWeeks = this.estimatedComplexity * (linesOfCode / numberOfDevelopers);
	}
	
	public int getNumberOfDevelopers() {
		return numberOfDevelopers;
	}
	public void setNumberOfDevelopers(int numberOfDevelopers) {
		this.numberOfDevelopers = numberOfDevelopers;
	}
	public int getLinesOfCode() {
		return linesOfCode;
	}
	public void setLinesOfCode(int linesOfCode) {
		this.linesOfCode = linesOfCode;
	}
	public int getNumberOfMethods() {
		return numberOfMethods;
	}
	public void setNumberOfMethods(int numberOfMethods) {
		this.numberOfMethods = numberOfMethods;
	}
	public int getEstimatedNumberOfWeeks() {
		return estimatedNumberOfWeeks;
	}
	public void setEstimatedNumberOfWeeks(int estimatedNumberOfWeeks) {
		this.estimatedNumberOfWeeks = estimatedNumberOfWeeks;
	}
	public int getEstimatedComplexity() {
		return estimatedComplexity;
	}
	public void setEstimatedComplexity(int estimatedComplexity) {
		this.estimatedComplexity = estimatedComplexity;
	}
	

}
