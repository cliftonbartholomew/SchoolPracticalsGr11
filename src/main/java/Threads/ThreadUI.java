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
public class ThreadUI {

	public static void main(String[] args) {
		ThreadOne t1 = new ThreadOne();
		t1.start();

		ThreadTwo t2 = new ThreadTwo();
		Thread t = new Thread(t2);
		t.start();

//		NotThreadOne t1 = new NotThreadOne();
//		t1.run();
//
//		NotThreadTwo t2 = new NotThreadTwo();
//		t2.run();
	}
}
