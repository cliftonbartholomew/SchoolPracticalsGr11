/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessments.Y2021.JuneExam;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class ResultSetUI {

	public static void main(String[] args) {
		ResultSetManager m = new ResultSetManager("C:\\Users\\Cliftonb\\Documents\\NetBeansProjects\\SchoolPractical\\SchoolPracticals\\src\\main\\java\\JuneExam\\Results.txt");

		for (int i = 0; i < 0; i++) {
			String name = JOptionPane.showInputDialog("Enter your name");
			String email = JOptionPane.showInputDialog("Enter your email");
			int scoreAlg = Integer.parseInt(JOptionPane.showInputDialog("Enter your algebra score"));
			int scoreGeo = Integer.parseInt(JOptionPane.showInputDialog("Enter your geometry score"));
			int scoreTrig = Integer.parseInt(JOptionPane.showInputDialog("Enter your trigonometry score"));
			m.saveResultSet(name, email, scoreAlg, scoreGeo, scoreGeo);
		}
		m.printRatings();
	}
}
