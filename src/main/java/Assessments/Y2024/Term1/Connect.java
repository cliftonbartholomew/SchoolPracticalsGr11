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
public class Connect {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a sentence");
        Scanner sc = new Scanner(input);
        
        int score = 0;
        String previous = sc.next();
        while(sc.hasNext()){
            String word = sc.next();
            if(previous.charAt(previous.length()-1) == word.charAt(0)){
                score ++;
            }
            previous = word;
        }
        
        System.out.println("Your score: " + score);
    }
}
