/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessments.Y2021.NovemberExam;

/**
 *
 * @author Cliftonb
 */
public class Learner {

	private String learnerName;
	private String learnerCode;
	private Activity activityOne;
	private Activity activityTwo;

	public Learner(String inName, Activity oneIn, Activity twoIn) {
		learnerName = inName;
		activityOne = oneIn;
		activityTwo = twoIn;

		learnerCode = learnerName.toUpperCase().substring(0, 3) + ((int) (Math.random() * 90) + 10);

	}

	public double calcStudentTotalCost() {
		return activityOne.getCost() + activityTwo.getCost() + Activity.ANNUAL_EXCURSION_INSUARNCE_COST;
	}

	public String getLearnerCode() {
		return learnerCode;
	}

	public void setLearnerCode(String inLearnerCode) {
		learnerCode = inLearnerCode;
	}

	public String toString() {
		String output = "Name: " + learnerName + " (" + learnerCode + ")\n"
			+ "Activity 1: " + activityOne.getActivityDate().toString() + " - " + activityOne.getDescription() + "\n"
			+ "Activity 2: " + activityTwo.getActivityDate().toString() + " - " + activityTwo.getDescription() + "\n"
			+ "Cost : R" + (Math.round(calcStudentTotalCost() * 100)) / 100.0;

		return output;
	}
}
