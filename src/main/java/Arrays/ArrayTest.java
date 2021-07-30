/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import OOP.Transaction;
import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class ArrayTest {

	public static void main(String[] args) {
		int[] num = {5, 6};
		int sum = num[0] + num[1];

		//Transaction t =  new Transaction();
		Transaction[] tArr = new Transaction[100];

		int numNums = Integer.parseInt(JOptionPane.showInputDialog("How many numbers?"));

		int[] numArr = new int[numNums];

		int[] arr;

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter the next number"));
		}
	}
}
