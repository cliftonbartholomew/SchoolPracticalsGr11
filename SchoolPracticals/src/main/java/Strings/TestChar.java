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
public class TestChar {
    public static void main(String[] args) {
        
        //boolean b = Character.isAlphabetic('c');
        //int i = (int)('a')   - this is equal to 97
        
        //ShowInputDialog always returns a string
        //We will learn what the .charAt() function does next week
        char c = JOptionPane.showInputDialog("Enter a character").charAt(0);
        
        //TODO 1: ask the user to enter in a single character
        
        //TODO 2: if it is a letter, print out whether it is upper case or lower case AND if it is lowercase
        //print out the upper case version and visa versa
        
        //TODO 3: if it is a number, display if it is even or odd (use typecasting with the ascii table)
        
        //TODO 4: if is it not alphanumeric, state so in the output
        
        /**EXAMPLE 1:
        * Please enter a single character:       'a'
        * 
        * The letter you typed in was lowercase, the uppercase is 'A'
        **/
        
        /**EXAMPLE 2:
        * Please enter a single character:       'G'
        * 
        * The letter you typed in was uppercase, the lowercase is 'a'
        **/
        
        /**EXAMPLE 3:
        * Please enter a single character:       '2'
        * 
        * You entered an even number. 
        **/
        
        /**EXAMPLE 4:
        * Please enter a single character:       '%'
        * 
        * % is non-alphanumeric
        **/
    }
}
