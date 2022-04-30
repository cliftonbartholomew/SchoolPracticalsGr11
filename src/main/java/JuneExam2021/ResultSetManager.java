/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuneExam2021;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Cliftonb
 */
public class ResultSetManager {

	private String filePath;

	public ResultSetManager(String filePath) {
		this.filePath = filePath;
	}

	public void saveResultSet(String name, String email, int scoreAlg, int scoreGeo, int score) {
		ResultSet set = new ResultSet(name, email, scoreAlg, scoreGeo, scoreAlg);

		try {
			FileWriter fw = new FileWriter(this.filePath, true);
			PrintWriter pw = new PrintWriter(fw);

			pw.println(set.toString());
			pw.close();
		} catch (IOException ex) {
			System.out.println("IO exception occured. Result set not saved");
		}

	}

	public void printRatings() {
		File f = new File(this.filePath);

		try {
			Scanner fileScanner = new Scanner(f);

			double totalRatings = 0;
			int count = 0;
			ResultSet highest = null;

			System.out.println("MATH APP - ALL RESULTS");
			System.out.println("--------------------------------------");

			while (fileScanner.hasNext()) {
				String line = fileScanner.nextLine();
				Scanner lineScanner = new Scanner(line).useDelimiter("#");
				String name = lineScanner.next();
				String email = lineScanner.next();
				int scoreAlg = lineScanner.nextInt();
				int scoreGeo = lineScanner.nextInt();
				int scoreTrig = lineScanner.nextInt();

				ResultSet currentSet = new ResultSet(name, email, scoreAlg, scoreGeo, scoreTrig);

				count++;

				if (highest == null) {
					highest = currentSet;
				} else if (highest.getRating() < currentSet.getRating()) {
					highest = currentSet;
				}

				System.out.println(currentSet.nameAndRating());

				totalRatings += currentSet.getRating();
				lineScanner.close();
			}
			fileScanner.close();

			System.out.println("\n\nThere are " + count + " results with an average rating of " + totalRatings / count);
			System.out.println("The highest rating was: " + highest.nameAndRating());
		} catch (FileNotFoundException ex) {
			System.out.println("File: " + this.filePath + " was not found");
		}
	}

}
