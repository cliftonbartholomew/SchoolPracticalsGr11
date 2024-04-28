/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessments.Y2023.Term2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;

/**
 *
 * @author Cliftonb
 */
public class Logger {
    private String[] usernames;
    private int size;

    public Logger() {
        usernames = new String[200];
        size = 0;
        
        try {
            Scanner fileSc = new Scanner(new File("resources\\2023-04-25_log.txt"));
            
            while(fileSc.hasNext()){
                Scanner lineSc = new Scanner(fileSc.nextLine()).useDelimiter("#");
                
                String timestamp = lineSc.next();
                String name = lineSc.next();
                
                usernames[size] = name;
                size++;
            }
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Logger.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String toString(){
        String output = "";
        for (int i = 0; i < size; i++) {
            output+= usernames[i] + " ";
        }
        return output;
    }
    
    public void sort(){
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                if(usernames[i].compareTo(usernames[j]) > 0){
                    String temp = usernames[i];
                    usernames[i] = usernames[j];
                    usernames[j] = temp;
                }
            }
        }
    }
    
    public int search(String name){
        int i = -1;
        for (int j = 0; j < size; j++) {
            if(usernames[j].equalsIgnoreCase(name)){
                i = j;
                break;
            }
        }
        return i;
    }
    
    
    
    
}
