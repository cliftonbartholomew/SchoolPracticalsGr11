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
public class ExtractBirthdate {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter in your ID number");

		//isolate year month and day
		String year = input.substring(0, 2);
		String month = input.substring(2, 4);
		String day = input.substring(4, 6);

		//check add century
		if (Integer.parseInt(year) > 50) {
			year = "19" + year;
		} else {
			year = "20" + year;
		}

		//construct date
		String date = day + "/" + month + "/" + year;

		System.out.println(date);
	}
}
