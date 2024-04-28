/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strings;

/**
 *
 * @author Cliftonb
 */
public class RemoveAllVowels {
    public static void main(String[] args) {
        String input = "Hello darkness my old friend";
        
        String charsToRemove = "aeiou";
        
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char current = Character.toLowerCase(input.charAt(i));
            
            if(!charsToRemove.contains(current + "")){
                output += current;
            }
          
            
        }
        System.out.println(output);
    }
}
