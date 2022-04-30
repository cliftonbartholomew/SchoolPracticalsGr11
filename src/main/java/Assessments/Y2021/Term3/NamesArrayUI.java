/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessments.Y2021.Term3;

/**
 *
 * @author Cliftonb
 */
public class NamesArrayUI {

	public static void main(String[] args) {
		NamesArray n = new NamesArray();
		n.sort();
		n.delete("Callie");
		n.insert("Carrie");
	}
}
