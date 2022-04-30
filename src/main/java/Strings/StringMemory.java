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
public class StringMemory {

	public static void main(String[] args) {
		String name = "Paul";
		String name2 = "Paul";

		System.out.println(name == name2);
		System.out.println(name.equals(name2));

		String name3 = new String("Paul");
		String name4 = new String("Paul");
		//System.out.println(name3 == name4);
		System.out.println(name3.equals(name4));

		boolean ans = Character.isLetter('h');
		//int answer = Integer.parseInt(answerString);
	}
}
