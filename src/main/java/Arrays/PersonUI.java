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
public class PersonUI {

	public static void main(String[] args) {
		PersonArray pA = new PersonArray();
		pA.print();
		System.out.println("");
		System.out.println("");
		pA.sortByAge();
		pA.print();
	}
}
