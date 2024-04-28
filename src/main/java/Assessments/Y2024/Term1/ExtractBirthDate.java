/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessments.Y2024.Term1;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class ExtractBirthDate {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter in your ID number");

        //isolate year month and day
        String year = input.substring(0, 2);
        String month = input.substring(2, 4);
        String day = input.substring(4, 6);

        //check add century
        if (Integer.parseInt(year) > 50) {
            year = "19" + year;
        } else {
            year = "20" + year;
        }

        //construct date
        String date = day + "/" + month + "/" + year;

        System.out.println(date);
    }
}
