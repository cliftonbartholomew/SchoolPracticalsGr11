/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class Exercise2 {

	public static void main(String[] args) {

		String[] namesArr = new String[3];

		for (int i = 0; i < 3; i++) {
			namesArr[i] = JOptionPane.showInputDialog("Enter naame");
		}

		int longestLen = 0;
		int longestIndex = 0;

		for (int i = 0; i < namesArr.length; i++) {
			if (namesArr[i].length() > longestLen) {
				longestIndex = i;
				longestLen = namesArr[i].length();
			}

		}

		System.out.println("Longest name = " + namesArr[longestIndex]);

	}

}
}
