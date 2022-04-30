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
public class CellNumberFormat {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter in a string");
        
        //Split up the original string at key positions adding a space inbetween
        //Hint: draw it on paper
        String output = "+27" + input.substring(1, 3) + " " + input.substring(3,6) + " " + input.substring(6);
        
        System.out.println(output);
        
        
    }
}
