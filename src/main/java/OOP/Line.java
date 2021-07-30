/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author Cliftonb
 */
public class Line {

	private static int numLines = 0;
	public static final int SCREEN_LENGTH = 15;
	private int length;
	private char pattern;

	public Line() {

		numLines++;
		this.length = 5;
		this.pattern = '*';
	}

	//len and patt are formal parameters
	public Line(int length, char pattern) {
		this.length = length;
		this.pattern = pattern;
		numLines++;
	}

	public void draw() {
		for (int i = 0; i < this.length; i++) {
			System.out.print(this.pattern + "");

		}
		System.out.println("");
	}

	public void setLength(int len) {
		if (len < 40) {
			length = len;
		} else {
			System.out.println("The num is too big");
		}
	}

	public int getLenght() {
		return length;
	}

	public static int getNumLines() {
		return numLines;
	}

	public String toString() {
		return "Pattern: " + pattern + " Length: " + length;
	}

}
