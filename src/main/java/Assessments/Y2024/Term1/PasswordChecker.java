/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessments.Y2024.Term1;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class PasswordChecker {

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
