/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessments.Y2022.Term2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class UserDetails {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter your name, surname and age separated by a #");

		Scanner sc = new Scanner(input);

		String name = sc.next();
		String surname = sc.next();
		int age = sc.nextInt();

		System.out.println("Name: " + name + "\nSurname: " + surname + "\nAge: " + age);

	}

}
