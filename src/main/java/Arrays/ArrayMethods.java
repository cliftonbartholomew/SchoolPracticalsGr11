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
public class ArrayMethods {
    
    public static int [] nums = new int[100];
    public static String [] names = new String[100];
    public static int size = 0;
    
    
    public static void main(String[] args) {
        try {
            Scanner fileSc = new Scanner(new File("ratings.txt"));
            
            while(fileSc.hasNext()){
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line);
                
                String name = lineSc.next();
                int num = lineSc.nextInt();
                
                names[size] = name;
                nums[size] = num;
                size++;
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArrayMethods.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        print();
        System.out.println("=====================================");
        improvedSort();
        System.out.println("=====================================");
        print();
        
        
    }
    
    public static void improvedSort(){
        for (int i = size - 1; i > 0; i--) {
            
            boolean sorted = true;
            for (int j = 0; j < i; j++) {
                if(names[j].compareTo(names[j+1]) > 0){
                    String temp = names[j];
                    names[j] = names[j+1];
                    names[j + 1] = temp;
                    
                    int temp2 = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp2;
                    
                    sorted = false;
                }
            }
            
            if(sorted){
                break;
            }
        }
    }
    
    public static void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(names[i] + " " + nums[i]);
            
        }
    }
    
    public static int binarySearch(String name){
        
        int start = 0;
        int end = size - 1;
        while(start<=end){
            int mid = (start+end)/2;
            
            if(names[mid].equals(name)){
                return mid;
            }
            else if(names[mid].compareTo(name) > 0){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        
        return -1;
    }
    
    
    public static void add(int pos, String name, int num){
        for (int i = size; i > pos; i--) {
            nums[i] = nums[i-1];
            names[i] = names[i-1];
        }
        
        nums[pos] = num;
        names[pos] = name;
        size ++;
    }
    
    public static void delete(int pos){
        for (int i = pos; i < size; i++) {
            nums[i] = nums[i+1];
            names[i] = names[i+1];
        }
        
        size --;
    }
}
