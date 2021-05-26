/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Cliftonb
 */
public class NumArray {

	private int[] numArr = new int[150];
	private int size;

	public NumArray() {
		size = 0;

		try {
			Scanner sc = new Scanner(new File("C:\\Users\\Cliftonb\\Documents\\NetBeansProjects\\SchoolPractical\\SchoolPracticals\\src\\main\\java\\Arrays\\test.txt"));
			while (sc.hasNext()) {
				numArr[size] = sc.nextInt();
				size++;
			}
			sc.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Could not load numbers");
		}
	}

	public void printArr() {
		System.out.print("[");
		for (int i = 0; i < size; i++) {
			System.out.print(numArr[i] + " ");
		}
		System.out.println("]");
	}

	public void selectionSortImproved() {

		for (int currentIndex = 0; currentIndex < size; currentIndex++) {

			int lowestIndex = currentIndex;
			for (int i = currentIndex; i < size; i++) {
				if (numArr[i] < numArr[lowestIndex]) {
					lowestIndex = i;
				}
			}

			int temp = numArr[currentIndex];
			numArr[currentIndex] = numArr[lowestIndex];
			numArr[lowestIndex] = temp;
		}
	}

	public void selectionSort() {

		for (int currentIndex = 0; currentIndex < size; currentIndex++) {

			for (int i = currentIndex; i < size; i++) {
				if (numArr[i] < numArr[currentIndex]) {
					int temp = numArr[currentIndex];
					numArr[currentIndex] = numArr[i];
					numArr[i] = temp;

				}
				System.out.println();
			}
			System.out.println();

		}
	}

	public void bubbleSort() {
		for (int currentIndex = size - 1; currentIndex >= 0; currentIndex--) {

			for (int i = 0; i < currentIndex; i++) {
				if (numArr[i] > numArr[i + 1]) {
					int temp = numArr[i];
					numArr[i] = numArr[i + 1];
					numArr[i + 1] = temp;
				}
			}
		}
	}

}
