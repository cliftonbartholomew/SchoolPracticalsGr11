/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class SwopChars {
    public static void main(String[] args) {
        
        String in1 = JOptionPane.showInputDialog("Enter word 1: ");
        String in2 = JOptionPane.showInputDialog("Enter word 2: ");
        
        String out1 = in1.charAt(0) + in2.substring(1);
        String out2 = in2.charAt(0) + in1.substring(1);
        
        System.out.println(out1 + " " + out2);
    }
}
