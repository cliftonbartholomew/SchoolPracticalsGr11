/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class TillApp {

	public static void main(String[] args) {
		Till t = new Till("C:\\Users\\Cliftonb\\Documents\\NetBeansProjects\\SchoolPractical\\SchoolPracticals\\src\\main\\java\\OOP\\log.txt");
		int numItems = Integer.parseInt(JOptionPane.showInputDialog("How many items are being purchased?"));
		for (int i = 0; i < numItems; i++) {
			t.scanNextItem();
		}
		t.processCustomer();
	}
}
