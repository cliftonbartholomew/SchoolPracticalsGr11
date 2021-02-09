/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticePrac;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class ReverseString {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter in a string to be reversed");
        String output = "";
        
        //start looping from the LAST index to the first index
        for(int i = input.length() - 1; i >= 0; i --){
            //add each char to the output
            output += input.charAt(i);
        }
        
        System.out.println(output);
    }
    
}
