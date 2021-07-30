/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Cliftonb
 */
public class CodingAnalysisPracQuestion {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\Cliftonb\\Documents\\NetBeansProjects\\SchoolPractical\\SchoolPracticals\\src\\main\\java\\Scanners\\NamesandAges.txt");

		try {
			Scanner fileScanner = new Scanner(file);
			int sum = 0;
			int lineCount = 1;

			while (fileScanner.hasNext()) {
				String line = fileScanner.nextLine();

				Scanner lineScanner = new Scanner(line);

				int num = lineScanner.nextInt();

				sum += num;

				System.out.println("Line " + lineCount + " has been processed.");

			}

			System.out.println("The average of all the numbers is: " + sum);

		} catch (FileNotFoundException ex) {
			System.out.println("File not found");
		}
	}

}
