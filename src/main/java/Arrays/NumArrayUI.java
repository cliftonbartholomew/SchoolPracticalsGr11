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
public class NumArrayUI {

	public static void main(String[] args) {
		NumArray n = new NumArray();
		n.printArr();
		System.out.println("Size: " + n.getSize());
		n.bubbleSort();
		n.printArr();
		System.out.println("Size: " + n.getSize());
		n.insert(7);
		n.printArr();
		System.out.println("Size: " + n.getSize());
		n.insert(18);
		n.printArr();
		System.out.println("Size: " + n.getSize());
		n.delete(15);
		n.printArr();
		System.out.println("Size: " + n.getSize());
	}
}
