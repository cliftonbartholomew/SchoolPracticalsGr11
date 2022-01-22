/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.util.Scanner;

/**
 *
 * @author Cliftonb
 */
public class StringBean {

	private String str;

	public StringBean(String s) {
		this.str = s;
	}

	public void setString(String s) {
		this.str = s;
	}

	public int countWords() {
		Scanner sc = new Scanner(this.str);
		int count = 0;
		while (sc.hasNext()) {
			sc.next();
			count++;
		}
		sc.close();
		return count;
	}
}
