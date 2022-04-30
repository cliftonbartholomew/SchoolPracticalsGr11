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
public class GenerateEmail {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter your name").toLowerCase();

		//find the first and last space
		int firstSpaceIndex = input.indexOf(" ");
		int lastSpaceIndex = input.lastIndexOf(" ");

		//use the space indexes to isolate the first and last name
		String firstName = input.substring(0, firstSpaceIndex);
		String surname = input.substring(lastSpaceIndex + 1);

		//generate the email with substrings of the names
		String email = surname.substring(0, 3) + firstName.substring(0, 3) + "26" + "@sundryhighschool.co.za";

		System.out.println(email);
	}
}
