/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author Cliftonb
 */
public class RecursionBasics {

	public static void main(String[] args) {
		System.out.println(fibonacci(8));
	}

	public static int fibonacci(int num) {
		if (num == 1) {
			return 1;
		} else if (num == 2) {
			return 1;
		} else {
			return fibonacci(num - 1) + fibonacci(num - 2);
		}
	}
}
