/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessments.Y2022.JuneExam;

/**
 *
 * @author Cliftonb
 */
public class ClientUI {

	public static void main(String[] args) {
		ClientController cc = new ClientController();
		System.out.println(cc);
		cc.sort();
		System.out.println(cc);
		System.out.println("======================================");
		System.out.println(cc.search("Pieters"));
		System.out.println("======================================");
		System.out.println(cc.filterInsecureClients());
		System.out.println("======================================");
		System.out.println(cc.getClientWithHighestBill());
	}
}
