/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessments.Y2023.Term3;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cliftonb
 */
public class LogManager {
    private Log[] logs = new Log[1000];
    private int size = 0;
    
    public LogManager() {
        try {
            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");
            
            Scanner fileSc = new Scanner(new File("resources/2023-July.txt"));
            
            while(fileSc.hasNextLine()){
                Scanner lineSc = new Scanner(fileSc.nextLine()).useDelimiter("#");
                LocalDateTime dt = LocalDateTime.parse(lineSc.next(), inputFormatter);
                String message = lineSc.next();
                
                logs[size]=new Log(dt,  message);
                size ++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LogManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public double getLoadPercentage(){
        double count = 0;
        for (int i = 0; i < size; i++) {
            if(logs[i].isDuringPeak()){
                count++;
            }
            
        }
        
        return Math.round((count/size)*10000.0)/100.0;
        
    }
    
    public void sort(){
        for (int i = size -1; i > 0 ; i--) {
            boolean sorted = true;
            for (int j = 0; j < i; j++) {
                if(logs[j].getTime().isAfter(logs[j+1].getTime())){
                    Log temp = logs[j];
                    logs[j] = logs[j+1];
                    logs[j+1] = temp;
                    sorted = false;
                }
                
            }
            
            if(sorted){
                break;
            }
            
        }
    }
    
    public String toString(){
        String output = "";
        for (int i = 0; i < size; i++) {
            output+= logs[i] +"\n";
            
        }
        return output;
    }
}
