/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessments.Y2022.JuneExam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cliftonb
 */
public class ClientController {

	private static final String FILE_NAME = "resources/clients.txt";

	private Client[] clients = new Client[100];
	private int size = 0;

	public ClientController() {
		try {
			File f = new File(FILE_NAME);
			Scanner fileSc = new Scanner(f);

			while (fileSc.hasNext()) {
				String line = fileSc.nextLine();
				Scanner lineSc = new Scanner(line).useDelimiter("#");

				String name = lineSc.next();
				String email = lineSc.next();
				String password = lineSc.next();
				String typeStr = lineSc.next();
				int usage = lineSc.nextInt();

				int typeInt = Client.BRONZE_TIER;
				if (typeStr.equalsIgnoreCase("gold")) {
					typeInt = Client.GOLD_TIER;
				} else if (typeStr.equalsIgnoreCase("silver")) {
					typeInt = Client.SILVER_TIER;
				}

				Client nextClient = new Client(name, email, password, typeInt, usage);
				clients[size] = nextClient;
				size++;

				lineSc.close();
			}
			fileSc.close();
		} catch (FileNotFoundException ex) {
			Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	@Override
	public String toString() {
		String output = "";
		for (int i = 0; i < this.size; i++) {
			output += clients[i].toString() + "\n\n";
		}

		return output;
	}

	public void sort() {
		for (int sortedIndex = size - 1; sortedIndex > 0; sortedIndex--) {
			for (int currentIndex = 0; currentIndex < sortedIndex; currentIndex++) {
				if (clients[currentIndex].getSurname().compareTo(clients[sortedIndex].getSurname()) > 0) {
					Client temp = clients[sortedIndex];
					clients[sortedIndex] = clients[currentIndex];
					clients[currentIndex] = temp;
				}
			}
		}
	}

	public Client search(String surname) {
		int begin = 0;
		int end = size - 1;
		while (begin <= end) {
			int middle = (begin + end) / 2;

			if (clients[middle].getSurname().equalsIgnoreCase(surname)) {
				return clients[middle];
			} else if (clients[middle].getSurname().compareTo(surname) < 0) {
				begin = middle + 1;
			} else {
				end = middle - 1;
			}
		}

		return null;
	}

	public String filterInsecureClients() {
		String output = "";
		for (int i = 0; i < this.size; i++) {
			if (!clients[i].isSecure()) {
				output += clients[i].toString() + "\n\n";
			}
		}

		return output;
	}

	public Client getClientWithHighestBill() {
		Client highest = clients[0];

		for (int i = 1; i < this.size; i++) {
			if (clients[i].calculateCurrentBill() > highest.calculateCurrentBill()) {
				highest = clients[i];
			}
		}

		return highest;
	}

}
