/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessments.Y2022.Term1;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class CorrectInput {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter in a sentence");
		String output = "";

		//check if each char is a 3 or a 7 and correct
		for (int i = 0; i < input.length(); i++) {
			char currentL = input.charAt(i);
			if (currentL == '3') {
				output += "e";
			} else if (currentL == '7') {
				output += "t";
			} else {
				output += currentL;
			}
		}

		System.out.println(output);

	}
}
