/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author Cliftonb
 */
public class NotThreadTwo {

	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("NotThreadTwo: " + i);
				//sleep ThreadOne for one second
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}

	}
}
