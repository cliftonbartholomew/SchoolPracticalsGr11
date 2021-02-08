/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings.Challenges;

/**
 *
 * @author Cliftonb
 */
public class CountLetters {
    public static void main(String[] args) {
        String input = "This is a really long string that I want to test to see how many of each letter there is in the String";
        
        //countLetters[0] = numA; countLetters[1] = numB; ....
        int[] countLetters = new int[26];
        
        //loop through each letter
        for(int i = 0; i< input.length(); i++){
            //Make sure you are only counting ascii 97 (a) to 122 (z) (lower case)
            
            //letter check
            if(Character.isLetter(input.charAt(i))){
                //lower case conversion to get between 97 and 122
                char currentLetter = input.toLowerCase().charAt(i);
                
                //map (97;122) -> (0; 25) and increment count
                int position = (int)currentLetter - 97;
                countLetters[position]++;
            }
            
            
        }
        
        //for loop from 'a' to 'z'
        for(int i = 97; i < 123; i ++){
            System.out.println((char)i + " : " + countLetters[i - 97]);
        }
        
        
        
        
    }
    
}
