/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudnetMiniPAT;

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
public class StudentController {

	private StudentModel[] students = new StudentModel[100];
	private int size = 0;

	public StudentController() throws FileNotFoundException {
		Scanner fileSc = new Scanner(new File("resources\\students.txt"));

		while (fileSc.hasNext()) {
			Scanner lineSc = new Scanner(fileSc.nextLine());
			students[size++] = new StudentModel(lineSc.next(), lineSc.next(), lineSc.nextInt());
		}
	}

	public void delete(String name, String surname, int age) throws IOException {
		for (int i = 0; i < size; i++) {
			if (students[i].getName().equalsIgnoreCase(name) && students[i].getSurname().equalsIgnoreCase(surname)
				&& students[i].getAge() == age) {
				shiftLeft(i);
				size--;
				writeToFile();
				break;
			}
		}
	}

	public void add(String name, String surname, int age) throws IOException {
		int insertIndex;
		for (insertIndex = 0; insertIndex < size; insertIndex++) {
			if (students[insertIndex].getName().compareTo(name) > 0) {
				break;
			}
		}

		shiftRight(insertIndex);
		students[insertIndex] = new StudentModel(name, surname, age);
		size++;
		writeToFile();
	}

	private void shiftLeft(int index) {
		for (int i = index; i < size - 1; i++) {
			students[i] = students[i + 1];
		}
	}

	private void shiftRight(int index) {
		for (int i = size; i > index; i--) {
			students[i] = students[i - 1];
		}
	}

	public void sortByName() throws IOException {
		for (int sortedIndex = 0; sortedIndex < size; sortedIndex++) {
			for (int currentIndex = sortedIndex + 1; currentIndex < size; currentIndex++) {
				if (students[currentIndex].getName().compareTo(students[sortedIndex].getName()) < 0) {
					StudentModel temp = students[currentIndex];
					students[currentIndex] = students[sortedIndex];
					students[sortedIndex] = temp;
				}
			}
		}

		writeToFile();
	}

	public void sortByAge() throws IOException {
		for (int sortedIndex = 0; sortedIndex < size; sortedIndex++) {
			for (int currentIndex = sortedIndex + 1; currentIndex < size; currentIndex++) {
				if (students[currentIndex].getAge() < students[sortedIndex].getAge()) {
					StudentModel temp = students[currentIndex];
					students[currentIndex] = students[sortedIndex];
					students[sortedIndex] = temp;
				}
			}
		}

		writeToFile();
	}

	private void writeToFile() throws IOException {
		PrintWriter pw = new PrintWriter(new FileWriter("resources\\students.txt", false));

		for (int i = 0; i < size; i++) {
			pw.println(students[i].toString());
		}

		pw.close();
	}

	@Override
	public String toString() {
		String out = "";
		for (int i = 0; i < size; i++) {
			out += students[i] + "\n";
		}
		return out;
	}
}
