/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessments.Y2022.Term2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;

/**
 *
 * @author Cliftonb
 */
public class Logger {

	public static void log(String message) {
		try {
			FileWriter fw = new FileWriter("log.txt", true);
			PrintWriter pw = new PrintWriter(fw);

			pw.append("\n" + message);

			pw.close();

		} catch (IOException ex) {
			java.util.logging.Logger.getLogger(Logger.class.getName()).log(Level.SEVERE, null, ex);
		}

	}
}
