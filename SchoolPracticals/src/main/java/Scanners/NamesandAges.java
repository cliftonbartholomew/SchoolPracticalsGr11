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
public class NamesandAges {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\Cliftonb\\Documents\\NetBeansProjects\\SchoolPractical\\SchoolPracticals\\src\\main\\java\\Scanners\\NamesandAges.txt");

		Scanner fileScanner = new Scanner(file);

		String line = "", names = "";
		int sum = 0;

		while(fileScanner.hasNext()){
			line = fileScanner.nextLine();

			Scanner lineScanner = new Scanner(line).useDelimiter("#");
			
			//Break up the line into two parts
			names = lineScanner.next();
			int age = lineScanner.nextInt();

			//break up the name into two parts	
			Scanner namesScanner = new Scanner(names);
			String firstName = namesScanner.next();
			String lastName = namesScanner.next();

			sum += age;
			System.out.println(firstName + " " + lastName + "\t\t" + age);
		}

		System.out.println("The sum is: " + sum);
	}
	
}
