/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author Cliftonb
 */
public class ArrayBasics {

	public static void main(String[] args) {

		int[] numArr = {12, 41, 12, 12, 15};
		int[] numArr2 = new int[10];

		char[] charArr = new char[10];
		char[] charArr2 = {'f', 'g', 'h'};

		Animal[] aniArr = new Animal[10];
		Animal[] aniArr2 = {new Animal("dog"), new Animal("murray"), new Animal("bird")};

		String[] strArr = new String[10];

		Object[] oArr = {new Animal("dsfs"), new Integer(5), "Hello"};

		System.out.println("");

		System.out.println(numArr[0]);
		System.out.println(numArr[1]);
		System.out.println(numArr[2]);
		System.out.println(numArr[3]);
		System.out.println(numArr[4]);

		System.out.println("");

		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}

	}
}
