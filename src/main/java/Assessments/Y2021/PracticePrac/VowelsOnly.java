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
public class VowelsOnly {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter in a string");
        String output = "";
        
        //Check if a char is in this string
        String vowels = "aeiou";
        
        //Cycle through each letter
        for(int i = 0; i < input.length(); i ++){
            
            //if a letter is in the vowels string - keep it
            //Note: contains takes in a string. "" + char is a quick conversion to a string (this works for all primitive types).
            if(vowels.contains("" + input.charAt(i))){
                output += input.charAt(i);
            }
        }
        
        System.out.println(output);
    }
}
