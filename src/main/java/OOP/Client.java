/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author Cliftonb
 */
public class Client {

	private String clientName;
	private int accountNumber;
	private double balance;

	public Client(String clientName, int accountNumber, double balance) {
		this.clientName = clientName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String changeName() {
		return clientName.substring(clientName.lastIndexOf(" ") + 1) + clientName.charAt(0);
	}

	@Override
	public String toString() {
		return "Name: " + changeName() + ", Account number: " + accountNumber + ", Balance: " + balance;
	}
}
