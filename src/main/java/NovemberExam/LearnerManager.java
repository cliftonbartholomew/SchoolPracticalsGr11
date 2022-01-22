/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NovemberExam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cliftonb
 */
public class LearnerManager {

	private Learner[] learnerArr = new Learner[50];
	private int learnerCount = 0;

	public LearnerManager() {
		try {
			Scanner fileSc = new Scanner(new File("excursion.txt"));

			while (fileSc.hasNext()) {
				Scanner lineSc = new Scanner(fileSc.nextLine()).useDelimiter("#");

				String name = lineSc.next();

				String descOne = lineSc.next();
				double costOne = lineSc.nextDouble();
				Date dateOne = new Date(lineSc.next());

				String descTwo = lineSc.next();
				double costTwo = lineSc.nextDouble();
				Date dateTwo = new Date(lineSc.next());

				Activity one = new Activity(descOne, costOne, dateOne);
				Activity two = new Activity(descTwo, costTwo, dateTwo);

				learnerArr[learnerCount] = new Learner(name, one, two);
				learnerCount++;
			}

			fileSc.close();
		} catch (FileNotFoundException ex) {
			Logger.getLogger(LearnerManager.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void overrideLearnerCode() {
		for (int i = 0; i < learnerCount; i++) {
			learnerArr[i].setLearnerCode(learnerArr[i].getLearnerCode() + "" + i);
		}
	}

	public void sort() {
		for (int i = learnerCount - 1; i > 0; i--) {
			int highestIndex = 0;
			for (int currentIndex = 1; currentIndex <= i; currentIndex++) {
				if (learnerArr[currentIndex].calcStudentTotalCost() > learnerArr[highestIndex].calcStudentTotalCost()) {
					highestIndex = currentIndex;
				}
			}

			Learner temp = learnerArr[highestIndex];
			learnerArr[highestIndex] = learnerArr[i];
			learnerArr[i] = temp;
		}
	}

	public double getAverageCost() {
		double total = 0;
		for (int i = 0; i < learnerCount; i++) {
			total += learnerArr[i].calcStudentTotalCost();
		}

		return total / learnerCount;
	}

	//highest
	public double getHighestCost() {
		double highest = 0;
		for (int i = 0; i < learnerCount; i++) {
			if (learnerArr[i].calcStudentTotalCost() > highest) {
				highest = learnerArr[i].calcStudentTotalCost();
			}
		}

		return highest;
	}

	public double getLowestCost() {
		double lowest = learnerArr[0].calcStudentTotalCost();
		for (int i = 1; i < learnerCount; i++) {
			if (learnerArr[i].calcStudentTotalCost() < lowest) {
				lowest = learnerArr[i].calcStudentTotalCost();
			}
		}

		return lowest;
	}

	public void displaySummary() {
		System.out.println("SUMMARY STATISTICS");
		System.out.println("-------------------------------------");

		System.out.println("NUM LEARNERS: " + learnerCount);
		System.out.println("AVERAGE COST: " + getAverageCost());
		System.out.println("LOWEST COST: " + getLowestCost());
		System.out.println("HIGHEST COST: " + getHighestCost());
		System.out.println();
		System.out.println();
	}

	public void displayAllLearners() {
		System.out.println("LEARNER EXCURSIONS");
		System.out.println("-------------------------------------");
		for (int i = 0; i < learnerCount; i++) {
			System.out.println(learnerArr[i]);
			System.out.println("");
		}
		System.out.println("");
		System.out.println("");

	}

}
