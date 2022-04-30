/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessments.Y2021.Term1;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class RemoveChars {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter in a string to be edited: ");
        String removeStr = JOptionPane.showInputDialog(null, "Enter in the characters to be removed: ");
        String output = "";
        
        //cycle through the string
        for(int i = 0; i < input.length(); i ++){
            //if removeStr does not have the letter (note: ! means NOT
            if(!removeStr.contains(input.charAt(i) + "")){
                //add the letter to the output
                output += input.charAt(i);
            }
        }
        
        System.out.println(output);
    }
}
