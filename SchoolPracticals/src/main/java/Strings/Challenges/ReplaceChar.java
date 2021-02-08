/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings.Challenges;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class ReplaceChar {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter in a string:");
        
        //get the first space index
        int currentSpaceIndex = input.indexOf(" ");
        //algorithm always goes 1 after previous space up to 1 before next space 
        int previousSpaceIndex = -1;
        String output = "";
        
        //while there are no more spaces (indexOf returns -1)
        while(currentSpaceIndex > 0){
            //the next words is always from 1 after previous space up to 1 before next space 
            output += input.substring(previousSpaceIndex + 1, currentSpaceIndex) + "*";
            
            //move the previous space index to point to the current space 
            previousSpaceIndex = currentSpaceIndex;
            //move current space index to point to the next space
            currentSpaceIndex = input.indexOf(" ", previousSpaceIndex + 1);
            
            //if it is the last loop
            if(currentSpaceIndex < 0){
                //add the last word to the output (no star afterwards)
                output += input.substring(previousSpaceIndex + 1);
            }
                    
        }
        //replace the currentindex char with a * using substring
        
        System.out.println(output);
    }
    
    
}