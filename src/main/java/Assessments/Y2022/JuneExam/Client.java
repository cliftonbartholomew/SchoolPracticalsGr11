/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessments.Y2022.JuneExam;

import java.util.Scanner;

/**
 *
 * @author Cliftonb
 */
public class Client {

	private String fullname;
	private String email;
	private String password;
	private int clientTier;
	private int currentUsage;

	public static final int BRONZE_TIER = 0;
	public static final int SILVER_TIER = 1;
	public static final int GOLD_TIER = 2;

	public Client(String fn, String e, String p, int cT, int cU) {
		this.fullname = fn;
		this.email = e;
		this.password = p;
		this.clientTier = cT;
		this.currentUsage = cU;
	}

	public String getSurname() {
		String surname = "";

		Scanner nameSc = new Scanner(this.fullname);
		while (nameSc.hasNext()) {
			surname = nameSc.next();
		}

		return surname;
	}

	public double calculateCurrentBill() {
		int adjustedUsage = 0;
		double totalCost = 0;
		switch (this.clientTier) {
			case Client.BRONZE_TIER:
				totalCost = 100 + this.currentUsage * 0.80;
				break;
			case Client.SILVER_TIER:
				if (this.currentUsage > 300) {
					adjustedUsage = this.currentUsage - 300;
				}
				totalCost = 180 + adjustedUsage * 0.75;
				break;
			case Client.GOLD_TIER:
				if (this.currentUsage > 1000) {
					adjustedUsage = this.currentUsage - 1000;
				}
				totalCost = 350 + adjustedUsage * 0.68;
				break;
		}
		return totalCost;
	}

	public boolean isSecure() {
		boolean hasUpper = false, hasLower = false, hasDigit = false;

		for (char letter : this.password.toCharArray()) {
			if (Character.isUpperCase(letter)) {
				hasUpper = true;
			}
			if (Character.isLowerCase(letter)) {
				hasLower = true;
			}
			if (Character.isDigit(letter)) {
				hasDigit = true;
			}
		}
		return hasUpper && hasLower && hasDigit && this.password.length() >= 8;
	}

	@Override
	public String toString() {
		String tier = "";
		switch (this.clientTier) {
			case Client.BRONZE_TIER:
				tier = "Bronze";
				break;
			case Client.SILVER_TIER:
				tier = "Silver";
				break;
			case Client.GOLD_TIER:
				tier = "Gold";
				break;
		}
		return "USER: " + this.fullname
			+ "\nACCOUNT TIER: " + tier
			+ "\nCURRENT ACCOUNT: " + this.currentUsage + "MB@R" + this.calculateCurrentBill()
			+ "\nSECURE: " + this.isSecure();
	}

}
