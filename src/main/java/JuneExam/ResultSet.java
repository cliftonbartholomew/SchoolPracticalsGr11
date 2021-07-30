/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuneExam;

import java.util.Scanner;

/**
 *
 * @author Cliftonb
 */
public class ResultSet {

	private String name;
	private String email;
	private int scoreAlg;
	private int scoreGeo;
	private int scoreTrig;

	public ResultSet(String name, String email, int scoreAlg, int scoreGeo, int scoreTrig) {
		this.name = name;
		this.email = email;
		this.scoreAlg = scoreAlg;
		this.scoreGeo = scoreGeo;
		this.scoreTrig = scoreTrig;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name + "#" + email + "#" + scoreAlg + "#" + scoreGeo + "#" + scoreTrig;
	}

	public double getRating() {
		return this.scoreAlg * 0.35 + this.scoreGeo * 0.45 + this.scoreTrig * 0.2;
	}

	public String reformatName() {
		Scanner sc = new Scanner(this.name);
		String initials = "";
		String name = "";

		while (sc.hasNext()) {
			name = sc.next();
			if (!sc.hasNext()) {
				break;
			}
			initials += name.charAt(0);
		}
		return name.toUpperCase() + ", " + initials;
	}

	public String nameAndRating() {
		return this.reformatName() + ": " + this.getRating();

	}
}
