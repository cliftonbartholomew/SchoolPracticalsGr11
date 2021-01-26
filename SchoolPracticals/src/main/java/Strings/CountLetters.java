/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author Cliftonb
 */
public class CountLetters {
    public static void main(String[] args) {
        String input = "This is a really long string that I want to test to see how many of each letter there is in the String";
        
        int[] countLetters = new int[26];
        
        for(int i = 0; i< input.length(); i++){
            char currentLetter = input.toLowerCase().charAt(i);
            countLetters[(int)currentLetter - 97]++;
            
        }
        
        for(int i = 97; i < 123; i ++){
            System.out.println((char)i + " : " + countLetters[i]);
        }
    }
    
}
