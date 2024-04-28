/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strings;

import java.util.Scanner;

/**
 *
 * @author Cliftonb
 */
public class StaticNonStatic {
    public static void main(String[] args) {
        
        int num = 5;
        double num2 = 123.123;
        boolean b = true;
        char c = 'c';
        
        String name = "Clifton";
        name.charAt(0);
        String name2 = "Bob";
        name2.charAt(0);
        
        
        Scanner sc = new Scanner("Hello darkness my old friend");
        System.out.println("");
        
        Character.isLetter('c');
        Character.isLetter('2');
        Character.isDigit('2');
        Character.isLetterOrDigit(c);
        Character.isLowerCase(c);
        Character.isWhitespace(' ');
        Character.isWhitespace('\n');
        Character.isWhitespace('\t');
        Character.toLowerCase(c);
        
        //>=8 characters long
        //one uppercase
        //one lowercase
        //one other ($%#&*@)
        //one number
    }
            
}
