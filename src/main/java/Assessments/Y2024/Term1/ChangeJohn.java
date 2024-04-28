/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessments.Y2024.Term1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class ChangeJohn {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a sentence");
        Scanner sc = new Scanner(input);
        
        String output = "";
        while(sc.hasNext()){
            String word = sc.next();
            if(word.equalsIgnoreCase("John")){
                output += "Peter ";
            }
            else{
                output += word + " ";
            }
        }
        
        System.out.println(output);
    }
}
