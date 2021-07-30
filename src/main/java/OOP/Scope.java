/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author Cliftonb
 */
public class Scope {
	
	//class level variable, can be seen in EVERY method
	int a = 1;

	public static void main(String[] args) {
		//function variable, it can only be seen in the main method
		int b = 2;
		for(int i = 0; i < 5; i ++){
			//for loop variabel, it can only be seen in the for loop (note: same as i)
			int c = 3;

			
		}
		
	}

	public void testMethod(){

		//function variable, can only be seen in testMethod
		int d = 4;


		//int sum = a +b + c + d;
	}
}
