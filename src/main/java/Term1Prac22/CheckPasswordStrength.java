/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Term1Prac22;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class CheckPasswordStrength {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter in you password");

		//create boolean flags
		boolean hasDigit, hasUpper, hasLower, hasOther;
		hasDigit = hasUpper = hasLower = hasOther = false;

		//check each letter
		for (int i = 0; i < input.length(); i++) {
			int currentL = input.charAt(i);
			if (Character.isDigit(currentL)) {
				hasDigit = true;
			} else if (Character.isUpperCase(currentL)) {
				hasUpper = true;
			} else if (Character.isLowerCase(currentL)) {
				hasLower = true;
			} else {
				hasOther = true;
			}
		}

		//password is strong only if all are true
		if (hasDigit && hasUpper && hasLower && hasOther) {
			System.out.println("Password is strong!");
		} else {
			System.out.println("Password is weak!");
		}
	}
}
