/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Term2Prac22;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cliftonb
 */
public class AgeAnalysis {

	public static void main(String[] args) {
		File f = new File("resources//namesAndAges.txt");

		try {
			Scanner fileSc = new Scanner(f);

			String oldestName = "";
			int oldestAge = 0;
			while (fileSc.hasNextLine()) {
				String line = fileSc.nextLine();

				Scanner lineSc = new Scanner(line).useDelimiter("#");

				String name = lineSc.next();
				int age = lineSc.nextInt();

				if (age > oldestAge) {
					oldestAge = age;
					oldestName = name;
				}

			}

			System.out.println("The oldest person is " + oldestName + " at " + oldestAge + " years old.");

		} catch (FileNotFoundException ex) {
			Logger.getLogger(AgeAnalysis.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

}
