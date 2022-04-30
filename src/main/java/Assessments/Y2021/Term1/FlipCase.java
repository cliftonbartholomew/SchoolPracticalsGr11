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
public class FlipCase {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter a string to be flipped:");
        String output = "";
        
        //cycle through each letter
        for(int i = 0; i < input.length(); i ++){
            //if it is uppercase
            if(Character.isUpperCase(input.charAt(i))){
                //change it to lower case
                output += Character.toLowerCase(input.charAt(i));
            }
            //if is lowercase
            else if(Character.isLowerCase(input.charAt(i))){
                //change it to uppercase
                output += Character.toUpperCase(input.charAt(i));
            }
            else{
                //else its not a letter, just add it
                output += input.charAt(i);
            }
        }
        
        System.out.println(output);
    }
}
