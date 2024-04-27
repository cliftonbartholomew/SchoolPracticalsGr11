/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strings;

/**
 *
 * @author Cliftonb
 */
public class CaesarCypher {
    //DOG -> key of 1 -> EPH (encryption)
    //EPH -> DOG
    
    public static void main(String[] args) {
        String input = "DOG";
        String str1 = encrypt(input, 1);
        System.out.println("");//EPH
        
        String input2 = "EPH";
        String str2 = decrypt(input2, 1);
        System.out.println(""); //DOG
    }
    
    public static String encrypt(String input, int key){
        return "";
    }
    
    public static String decrypt(String input, int key){
        return "";
    }
}
