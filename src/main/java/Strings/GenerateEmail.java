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
public class GenerateEmail {
    public static void main(String[] args) {
        String name = "Bob Regionald Sanders";
        
        
        Scanner sc = new Scanner(name);
        String initials = "";
        
        String lastname2 = "";
        while(sc.hasNext()){
            lastname2 = sc.next();
            if(sc.hasNext()){
                initials += lastname2.charAt(0);
            }
        }
        
        
        
        
        
        
        
        
        
        int firstNameIndex = name.indexOf(" ");
        int lastNameIndex = name.lastIndexOf(" ");
        
        String firstname = name.substring(0, firstNameIndex);
        String lastname = name.substring(lastNameIndex + 1, name.length());
        
        String email = firstname + "." + lastname + "@reddam.house";
        
        System.out.println(email);
    }
}
