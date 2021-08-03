package Term3Prac;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NamesArray {

	private String[] names;
	private int size;

	public NamesArray() {
		size = 0;
		names = new String[100];
		try {
			Scanner sc = new Scanner(new File("resources\\names.txt"));
			while (sc.hasNext()) {
				names[size] = sc.next();
				size++;
			}
			sc.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Could not load names");
		}
	}

	public void sort() {
		//bubble sort
		for (int currentIndex = size - 1; currentIndex >= 0; currentIndex--) {
			for (int i = 0; i < currentIndex; i++) {
				if (names[i].compareTo(names[i + 1]) > 0) {
					String temp = names[i];
					names[i] = names[i + 1];
					names[i + 1] = temp;
				}
			}
		}
	}

	public int search(String name) {
		for (int i = 0; i < size; i++) {
			if (names[i].equals(name)) {
				return i;
			}
		}

		return -1;
	}

	public String toString() {
		String output = "[";
		for (int i = 0; i < size; i++) {
			output += names[i] + " ";
		}
		return output + "]";
	}

	public void insert(String name) {
		int index = -1;
		for (int i = 0; i < size; i++) {
			if (names[i].compareTo(name) > 0) {
				index = i;
				break;
			}
		}
		shiftRight(index);
		names[index] = name;
	}

	private void shiftRight(int index) {
		size++;
		for (int i = size - 1; i > index; i--) {
			names[i] = names[i - 1];
		}
	}

	public void delete(String name) {
		int index = search(name);

		if (index >= 0) {
			shiftLeft(index);
		}
	}

	private void shiftLeft(int index) {
		for (int i = index; i < size - 1; i++) {
			names[i] = names[i + 1];
		}
		size--;
	}

}
