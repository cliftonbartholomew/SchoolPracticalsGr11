/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessments.Y2021.PracticePrac;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class CountCharTypes {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter in a string");
        
        //Create counters for each type
        int countUpper = 0;
        int countLower = 0;
        int countDigit = 0;
        int countOther = 0;
        
        //cycle through each letter of the string
        for(int i = 0; i < input.length(); i ++){
            //check which type the letter is and add to that counter
            if(Character.isUpperCase(input.charAt(i)))
                countUpper++;
            else if(Character.isLowerCase(input.charAt(i)))
                countLower++;
            else if(Character.isDigit(input.charAt(i)))
                countDigit++;
            else
                countOther++;
        }
        
        //Print the results neatly
        System.out.println("Uppercase chars: " + countUpper);
        System.out.println("Lowercase chars: " + countLower);
        System.out.println("Digit chars: " + countDigit);
        System.out.println("Special chars: " + countOther);
    }
}
