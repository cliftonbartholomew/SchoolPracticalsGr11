/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class Till {

	private String logFilePath;
	private double totalCost;

	public Till(String logFilePath) {
		this.logFilePath = logFilePath;
		this.totalCost = 0;

	}

	public void scanNextItem() {
		String itemDescriptor = JOptionPane.showInputDialog("Enter the descriptor of the item: ");
		String itemBrand = JOptionPane.showInputDialog("Enter the brand of the item: ");
		int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity of the item: "));
		String barcode = JOptionPane.showInputDialog("Enter the barcode of the item: ");
		double cost = Double.parseDouble(JOptionPane.showInputDialog("Enter the price of the item: "));
		boolean isVATExclusive = Boolean.parseBoolean(JOptionPane.showInputDialog("Is the item VAT inclusive? true or false: "));

		Transaction tr = new Transaction(itemDescriptor, itemBrand, quantity, barcode, cost, isVATExclusive);

		this.totalCost += tr.getCost() * tr.getQuantity();

		this.logTransaction(tr);

		System.out.println("");
	}

	private void logTransaction(Transaction transaction) {
		try {
			FileWriter fw = new FileWriter(logFilePath, true);
			PrintWriter pw = new PrintWriter(fw);
			pw.append(transaction.toString() + "\n");
			pw.close();
		} catch (IOException e) {
			System.out.println("An IOException has occurred.");
		}
	}

	private void printReciept() {
		File f = new File(this.logFilePath);

		try {
			Scanner fileScanner = new Scanner(f);
			System.out.println("ITEM \t\t QUANTITY \t\t COST");
			System.out.println("-------------------------------------------");
			while (fileScanner.hasNext()) {
				Scanner lineScanner = new Scanner(fileScanner.nextLine()).useDelimiter("#").useLocale(Locale.US);
				String itemDescriptor = lineScanner.next();
				String itemBrand = lineScanner.next();
				int quantity = lineScanner.nextInt();
				String barcode = lineScanner.next();
				double cost = lineScanner.nextDouble();
				boolean isVATExclusive = lineScanner.nextBoolean();

				Transaction tr = new Transaction(itemDescriptor, itemBrand, quantity, barcode, cost, isVATExclusive);

				System.out.println(tr.getItemDescriptor() + "\t\t" + tr.getQuantity() + "\t\t\t" + tr.getCost() * tr.getQuantity());
				lineScanner.close();
			}
			fileScanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("Could not find the log");
		}

	}

	public void processCustomer() {
		this.printReciept();
		System.out.println("");
		System.out.println("TOTAL COST: " + this.totalCost);
	}

}
