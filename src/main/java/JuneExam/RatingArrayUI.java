/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuneExam;

/**
 *
 * @author Cliftonb
 */
public class RatingArrayUI {

	public static void main(String[] args) {
		RatingArray a = new RatingArray();
		a.sort();

		System.out.println("NUMBER SUMMARY");
		System.out.println("---------------------");
		System.out.println("LOWEST = " + a.getElement(0));
		System.out.println("HIGHEST = " + a.getElement(a.getSize() - 1));
		System.out.println("AVERAGE = " + a.getAverage());
	}

}
