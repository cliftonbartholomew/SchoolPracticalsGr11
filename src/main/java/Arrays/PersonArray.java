/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cliftonb
 */
public class PersonArray {

	private Person[] pArr = new Person[50];
	private int size = 0;

	public PersonArray() {
		try {
			Scanner fileScanner = new Scanner(new File("resources//people.txt"));

			while (fileScanner.hasNext()) {
				Scanner lineScanner = new Scanner(fileScanner.nextLine());

				String name = lineScanner.next();
				String surname = lineScanner.next();
				int age = lineScanner.nextInt();

				pArr[size] = new Person(name, surname, age);
				size++;
			}

			fileScanner.close();
		} catch (FileNotFoundException ex) {
			Logger.getLogger(PersonArray.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void sortByAge() {
		for (int sortedIndex = size - 1; sortedIndex > 0; sortedIndex--) {
			for (int currentIndex = 0; currentIndex <= sortedIndex - 1; currentIndex++) {
				if (pArr[currentIndex].getAge() > pArr[currentIndex + 1].getAge()) {
					Person temp = pArr[currentIndex];
					pArr[currentIndex] = pArr[currentIndex + 1];
					pArr[currentIndex + 1] = temp;
				}
			}
		}
	}

	public void print() {
		for (int i = 0; i < size; i++) {
			System.out.println(pArr[i]);
		}
	}
}
