/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessments.Y2023.JuneExam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cliftonb
 */
public class ISPController {
    private ISPConnection[] ispArr = new ISPConnection[200];
    private int size = 0;
    
    public ISPController(){
        try {
            Scanner fileSc = new Scanner(new File("isps.txt"));
            
            while(fileSc.hasNextLine()){
                Scanner lineSc = new Scanner(fileSc.nextLine()).useDelimiter(",");
                
                String ip = lineSc.next();
                String clientID = lineSc.next();
                String ISP = lineSc.next();
                String date = lineSc.next();
                
                ispArr[size] = new ISPConnection(ip, clientID, ISP, date);
                size++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ISPController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String toString(){
        String output="";
        for(int i =0; i < size; i++){
            output += ispArr[i].toString() + "\n";
        }
        return output;
    }
    
    public void sortByISP(){
        for (int i = 0; i < size; i++) {
            int smallest = i;
            for (int j = i + 1; j < size; j++) {
                if(ispArr[j].getIsp().compareTo(ispArr[smallest].getIsp())< 0){
                    smallest = j;
                }
            }
            
            ISPConnection temp = ispArr[i];
            ispArr[i] = ispArr[smallest];
            ispArr[smallest] = temp;
        }
    }
    
    public ISPConnection search(String clientID){
        for (int i = 0; i < size; i++) {
            if(ispArr[i].getClientId().equals(clientID)){
                return ispArr[i];
            }
            
        }
        return null;
    }
    
    private void deleteEntry(int i){
        for (int j = i; j < size - 1; j++) {
            ispArr[j] = ispArr[j+1];
        }
        size--;
    }
    
    public void addConnection(ISPConnection i){
        ispArr[size] = i;
        size ++;
    }
    
    public String removeInvalidIPs(){
        String output = "Deleted ISPs:\n";
        for (int i = 0; i < size; i++) {
            if(!ispArr[i].validIP()){
                output += ispArr[i].getIsp()+": " + ispArr[i].getClientId() + "\n";
                deleteEntry(i);
                i--;
            }
            
        }
        return output;
    }
}
