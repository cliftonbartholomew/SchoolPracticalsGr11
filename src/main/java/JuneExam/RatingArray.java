/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuneExam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Cliftonb
 */
public class RatingArray {

	private int[] ratings;
	private int size;

	public RatingArray() {
		ratings = new int[150];
		size = 0;
		File f = new File("C:\\Users\\Cliftonb\\Documents\\NetBeansProjects\\SchoolPractical\\SchoolPracticals\\src\\main\\java\\JuneExam\\ClientRatings.txt");
		try {
			Scanner sc = new Scanner(f);
			while (sc.hasNext()) {
				ratings[size] = sc.nextInt();
				size++;
			}
		} catch (FileNotFoundException ex) {
			System.out.println("File not found");
		}
	}

	public int getSize() {
		return size;
	}

	public int getElement(int index) {
		return ratings[index];
	}

	public String toString() {
		String output = "[";
		for (int i = 0; i < size; i++) {
			if (i == size - 1) {
				output += ratings[i];
			} else {
				output += ratings[i] + ", ";
			}
		}
		return output.trim() + "]";
	}

	public double getAverage() {
		double total = 0;
		for (int i = 0; i < size; i++) {
			total += ratings[i];
		}
		return total / size;
	}

	public void sort() {
		for (int i = 0; i < size; i++) {
			int min = ratings[i];
			int minIndex = i;
			for (int j = i; j < size; j++) {
				if (ratings[j] < min) {
					minIndex = j;
					min = ratings[j];
				}
			}
			int temp = ratings[i];
			ratings[i] = min;
			ratings[minIndex] = temp;
		}
	}

	public int binarySearch(int score) {
		int begin = 0;
		int end = size - 1;
		int middle;
		while (begin <= end) {
			middle = (begin + end) / 2;
			if (ratings[middle] == score) {
				return middle;
			} else if (ratings[middle] > score) {
				end = middle - 1;
			} else {
				begin = middle + 1;
			}
		}
		return -1;
	}

}
