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
public class WordGames {
    public static void main(String[] args) {
        String previousWord = JOptionPane.showInputDialog(null, "Enter in a word: ");
        String currentWord = "";
        int score = 0;
        boolean cont = true;
        
        while(cont){
            currentWord = JOptionPane.showInputDialog(null, "Enter in a word: ");
            
            //get the first letter of the current word
            char firstLetter = currentWord.toLowerCase().charAt(0);
            //and the last letter of the previous word
            char lastLetter = previousWord.toLowerCase().charAt(previousWord.length()-1);
            
            if( firstLetter == lastLetter){
                //win a point
                score ++;
                //make the current word the previous word for the next round
                previousWord = currentWord;
            }
            else{
                cont = false;
            }
        }
        
        System.out.println("You got " + score + " points!");
        
    }
}
