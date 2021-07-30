/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanners;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class StoreLoginDetails {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("loginDetails.txt", true);
			PrintWriter pw = new PrintWriter(fw);

			String username = JOptionPane.showInputDialog("Enter in a username (enter STOP to end input)");
			String password = JOptionPane.showInputDialog("Enter in the password for " + username);

			while (!username.equalsIgnoreCase("STOP")) {
				pw.append(username + "#" + password + "\n");

				username = JOptionPane.showInputDialog("Enter in a username (enter STOP to end input)");
				password = JOptionPane.showInputDialog("Enter in the password for " + username);
			}
			pw.close();

		} catch (IOException ex) {
			System.out.println("Could not write to file");
		}
	}

}
