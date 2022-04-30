/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuneExam2021;

import java.io.IOException;

/**
 *
 * @author Cliftonb
 */
public class Test {

	public static void main(String[] args) throws IOException {
		System.out.println(getDateOfBirth("9105185125083"));
		System.out.println(getDateOfBirth("0001025835082"));
	}

	public static String getDateOfBirth(String ID) {
		String century = ID.substring(0, 2);
		String month = ID.substring(2, 4);
		String day = ID.substring(4, 6);

		if (Integer.parseInt(century) < 50) {
			century = "20" + century;
		} else {
			century = "19" + century;
		}

		return day + "-" + month + "-" + century;
	}
}
