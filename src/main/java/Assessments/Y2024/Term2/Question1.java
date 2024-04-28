/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessments.Y2024.Term2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class Question1 {
    public static int[] reps = new int [100];
    public static int size = 0;
    
    public static void main(String[] args) {
        try {
            Scanner fileSc = new Scanner(new File("reps.txt"));
            
            while(fileSc.hasNext()){
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line);
                
                String name = lineSc.next();
                int rep = lineSc.nextInt();
                
                reps[size] = rep; 
                size ++;
            }
            
            
            print();
            sort();
            print();
            
            int pos = binarySearch(5);
            System.out.println("5 is at pos " + pos);
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Question1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public static void print(){
        for (int i = 0; i < size; i++) {
            System.out.print(reps[i] + " ");
        }
    }
    
    public static void sort(){
        for (int i = size-1; i > 0; i--) {
            boolean sorted = true;
            for (int j = 0; j < i; j++) {
                if(reps[i] > reps[i+1] ){
                    sorted = false;
                    int temp = reps[i];
                    reps[i] = reps[i+1];
                    reps[i+1] = temp;
                }
                
            }
            if(sorted){
                break;
            }
            
        }
    }
    
    public static int binarySearch(int val){
        
        int start = 0;
        int end = size -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(reps[mid] == val){
                return mid;
            }
            else if(reps[mid] > val){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        
        return -1;
    }
}
