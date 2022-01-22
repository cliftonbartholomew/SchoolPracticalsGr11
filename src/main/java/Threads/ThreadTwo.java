package Threads;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cliftonb
 */
public class ThreadTwo implements Runnable {

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("ThreadTwo: " + i);
				//sleep ThreadTwo for one second
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
