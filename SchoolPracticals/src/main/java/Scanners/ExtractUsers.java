/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanners;

import java.util.Scanner;

/**
 *
 * @author Cliftonb
 */
public class ExtractUsers {
	public static void main(String[] args) {
		String s = "James#Barty#4443%#Peter#Paul#4434^#Frendlin#Franklin#2223@#Private#Seargeant#3343(";
		Scanner sc = new Scanner(s);

		sc.useDelimiter("#");

		String name; 
		String surname;
		String pass;
		String email;
		while (sc.hasNext()) {
			name = sc.next();
			surname = sc.next();
			pass = sc.next();
			email = name.toLowerCase()+"."+surname.toLowerCase()+"@reddam.house";
				
			System.out.println("Name: " + name);
			System.out.println("Surname: " + surname);
			System.out.println("Password: " + pass);
			System.out.println("Email: " + email);
			System.out.println("");
		}
	}
	
}
