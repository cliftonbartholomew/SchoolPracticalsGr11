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
public class CharForLoop {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i < 1000; i+=3){
			sum+= i;
		}
		System.out.println("Sum of 3's from 0 - 1000: " +sum);

		sum = 0;
		for(int i = 2506; i <=3000; i+=7){
			sum+= i;
		}

		System.out.println("Sum of 7's from 2500 - 3000: " + sum);

		sum=0;
		for(char i = 'b'; i <='z'; i +=2){
			System.out.print(i + "  ");
		}

		sum=0;
		for(int i = 102; i<201; i+=2){
			sum +=i;
		}

		System.out.println("");
		System.out.println("Sum of even numbers from 101 - 201" +sum);
	}
}
