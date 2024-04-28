/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessments.Y2024.Term2;

import static Assessments.Y2024.Term2.Question1.size;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static Assessments.Y2024.Term2.Question1.reps;

/**
 *
 * @author Cliftonb
 */
public class Question2 {
    public static String names[] = new String[100];
    public static int size = 0;
    
    public static void main(String[] args) {
        try {
            Scanner fileSc = new Scanner(new File("names.txt"));
            
            while(fileSc.hasNext()){
                String line = fileSc.next();
                Scanner lineSc = new Scanner(line);
                
                String id = lineSc.next();
                String name = lineSc.next();
                
                names[size] = name;
                size++;
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Question2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static double avgLength(){
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += names[i].length();
            
        }
        
        return total/size;
    }
    
    public static int linearSearch(String val){
        for (int i = 0; i < size; i++) {
            if(names[i].equals(val)){
                return i;
            }
        }
        return -1;
    }
}
