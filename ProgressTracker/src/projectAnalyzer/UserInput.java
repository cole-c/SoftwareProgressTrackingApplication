package projectAnalyzer;
import java.util.Random;;

public class UserInput {
	
	private int numberOfDevelopers = 0;
	private int skillOfDevelopers = 0;
	private int linesOfCode = 0;
	private int numberOfMethods = 0;
	private int estimatedNumberOfWeeks = 0;
	private int estimatedComplexity = 0;
	
	public void projectAnalyzer(int numberOfDevelopers, int linesOfCode, int numberOfMethods, int skillOfDevs) {
		this.numberOfDevelopers = numberOfDevelopers;
		this.linesOfCode = linesOfCode;
		this.numberOfMethods = numberOfMethods;
		this.skillOfDevelopers = skillOfDevs;
		
//		Random rand = new Random();
//		this.estimatedComplexity = rand.nextInt() % 5;
		this.estimatedComplexity = (int) Math.round(linesOfCode/3500.0 * numberOfMethods/2.0);
		this.estimatedNumberOfWeeks = (int) Math.round(this.estimatedComplexity * ((linesOfCode * 1.0) / (numberOfDevelopers * skillOfDevs * 175.0)));
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

	public int getSkillOfDevelopers() {
		return skillOfDevelopers;
	}

	public void setSkillOfDevelopers(int skillOfDevelopers) {
		this.skillOfDevelopers = skillOfDevelopers;
	}
	

}
