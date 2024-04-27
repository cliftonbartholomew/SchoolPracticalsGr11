/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessments.Y2023.JuneExam;

/**
 *
 * @author Cliftonb
 */
public class ISPUI {
    public static void main(String[] args) {
        ISPController c = new ISPController();
        System.out.println(c.removeInvalidIPs());
        System.out.println(c.toString());
        c.sortByISP();
        System.out.println(c.search("190646").getIsp());
        
        ISPConnection cont = new ISPConnection("195.211.0.12", "888646", "Telkom", "09/06/23");
        c.addConnection(cont);
        System.out.println(c);
    }
}
