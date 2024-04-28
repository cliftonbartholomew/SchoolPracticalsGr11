/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessments.Y2024.Term1;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class RemoveVowels {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a message");
        
        String output = "";
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.toLowerCase().charAt(i);
            
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                output += "#";
            }
            else{
                output += input.charAt(i);
            }
            
        }
        
        System.out.println(output);
    }
}
