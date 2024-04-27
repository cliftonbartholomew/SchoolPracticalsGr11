/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cliftonb
 */
public class ClientRatings {

    private int[] ratings;
    private int size;

    public ClientRatings() {
        ratings = new int[100];
        size = 0;

        Scanner fileSc;
        try {
            fileSc = new Scanner(new File("ratings.txt"));

            while (fileSc.hasNext()) {
                String line = fileSc.nextLine();

                Scanner lineSc = new Scanner(line);
                String name = lineSc.next();
                int rating = lineSc.nextInt();

                ratings[size] = rating;
                size++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ClientRatings.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void sort() {

    }

    public boolean contains(int value) {

        return false;
    }
    
    public String toString(){
        String output = "";
        
        for (int i = 0; i < size; i++) {
            output+= ratings[i] + " ";
            
        }
        
        return output;
    }
}
