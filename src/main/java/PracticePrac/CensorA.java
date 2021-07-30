/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticePrac;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class CensorA {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter in a string");
		String output = "";

		//currentS is NOT found. Our algorithm always substrings from one AFTER the current index
		//Draw on paper to see how it works.
		int currentSIndex = -1;
		//collect the first occurence of "a", use lowercase ignore case.
		int nextSIndex = input.toLowerCase().indexOf("a");

		//while there is still an a (-1 will mean no more a's)
		while (nextSIndex >= 0) {
			//add a slice of text from just after the last 'a' to just before the next 'a'
			output += input.substring(currentSIndex + 1, nextSIndex) + "$";

			//shift up the markers
			currentSIndex = nextSIndex;
			nextSIndex = input.toLowerCase().indexOf("a", nextSIndex + 1);

			//if we are on our last cycle, add the last snippet of string to the output
			if (nextSIndex < 0) {
				output += input.substring(currentSIndex + 1);
			}
		}

		System.out.println(output);
	}
}
