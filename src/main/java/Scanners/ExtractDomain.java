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
public class ExtractDomain {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\Cliftonb\\Documents\\NetBeansProjects\\SchoolPractical\\SchoolPracticals\\src\\main\\java\\Scanners\\websites.txt");

		try {
			Scanner fileScanner = new Scanner(f);
			int count = 0;

			while (fileScanner.hasNext()) {
				Scanner lineScanner = new Scanner(fileScanner.nextLine());
				lineScanner.useDelimiter("\\.");
				lineScanner.next();
				String domain = lineScanner.next();
				System.out.println("Domain " + count + " : " + domain);
				count++;
				lineScanner.close();
			}

			System.out.println("Websites processed: " + count);
			fileScanner.close();
		} catch (FileNotFoundException ex) {
			System.out.println("The file was not found");
		}
	}

}
