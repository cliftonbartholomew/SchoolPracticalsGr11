package Strings;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class ExtractInitials {
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Enter your full name: ");
        
        int lastSpaceIndex = input.lastIndexOf(" ");
        int currentSpaceIndex = input.indexOf(" ");
        
        //Add the first initial (auto convert the char)
        String output = "" + input.charAt(0);
        
        //For all the spaces before the last one
        while(currentSpaceIndex < lastSpaceIndex){
            //add the next letter after a space
            output += input.charAt(currentSpaceIndex + 1);
            
            //start searching for the space after this one
            currentSpaceIndex = input.indexOf(" ", currentSpaceIndex + 1);
        }
        
        //Add a space and the last name
        output += " " + input.substring(lastSpaceIndex + 1);
        
        System.out.println(output);
       
        
    }
    
}
