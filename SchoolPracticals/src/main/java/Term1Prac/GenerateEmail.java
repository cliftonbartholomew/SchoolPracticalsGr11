/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Term1Prac;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class GenerateEmail {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter in your full name: ");
        
        //find the first and last space
        int firstSpaceIndex = input.indexOf(" ");
        int lastSpaceIndex = input.lastIndexOf(" ");
        
        //use the space indexes to isolate the first and last name
        String email = input.toLowerCase().substring(0, firstSpaceIndex) + "." + input.toLowerCase().substring(lastSpaceIndex+1) + "@reddam.house";
        
        System.out.println(email);
    }
}
