/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cliftonb
 */
public class ScannerBegin {

	public static void main(String[] args) {
		try {
			//		//initialise
//		String s = "Hello darkness my old friend";
//
//		Scanner sc = new Scanner(s);
//
//		//test
//		while (sc.hasNext()) {
//			//process/change
//			String word = sc.next();
//
//			System.out.println(word);
//		}
//
//		String input = JOptionPane.showInputDialog("Enter name and age");
//
//		int oldestAge = -1;
//
//		while (!input.equals("stop")) {
//
//			//process
//			Scanner sc = new Scanner(input);
//			String name = sc.next();
//			String age = sc.nextInt();
//
//			if () //change
//			{
//				input = JOptionPane.showInputDialog("Enter name and age");
//			}
//		}
			String fileName = "resources//names.txt";
			File f = new File(fileName);
			Scanner fileScanner = new Scanner(f);
		} catch (FileNotFoundException ex) {
			Logger.getLogger(ScannerBegin.class.getName()).log(Level.SEVERE, null, ex);
		}

	}
}
