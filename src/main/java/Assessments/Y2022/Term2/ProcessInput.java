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
public class ProcessInput {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter your name"
			+ ", your age, your product to purchase (including price)"
			+ ", and the name of the store."
			+ "\n\n Your input should be in the following format:"
			+ "\nClifton Bartholomew#31#beans%12,50#spar");

		Scanner inputSc = new Scanner(input).useDelimiter("#");

		String name = inputSc.next();
		int age = inputSc.nextInt();
		String product = inputSc.next();
		double price = inputSc.nextDouble();
		String store = inputSc.next();

		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Product name: " + product);
		System.out.println("Product price: " + price);
		System.out.println("Store: " + store);
	}
}
