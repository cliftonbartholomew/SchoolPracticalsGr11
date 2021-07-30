/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Cliftonb
 */
public class GenerateNumbers {

	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter(new FileWriter("aggregates.txt", true));
			for (int i = 0; i < 1350; i++) {
				pw.println((int) (Math.random() * 450 + 250));
			}
			pw.close();
		} catch (IOException ex) {
			System.out.println("oh no...");
		}

	}
}
