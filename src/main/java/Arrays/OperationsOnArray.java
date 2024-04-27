/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Cliftonb
 */
public class OperationsOnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        double ave = average(arr);
    }
    
    
    public static double average(int[] numArr){
        double total = 0;
        
        for (int i = 0; i < numArr.length; i++) {
            total += numArr[i];
            
        }
        
        return total/numArr.length;
    }
    
    public static int highest(int[] numArr){
        int highest = numArr[0];
        
        for (int i = 1; i < numArr.length; i++) {
            if(numArr[i] > highest){
                highest = numArr[i];
            }
            
        }
        
        return highest;
    }
    
    public static boolean contains(int[] numArr, int value){
        for (int i = 0; i < numArr.length; i++) {
            if(numArr[i] == value){
                return true;
            }
            
        }
        
        return false;
    }
    
    public static String mostAlpha(String[] names){
        String mostAlpha = names[0];
        
        for (int i = 0; i < names.length; i++) {
            if(mostAlpha.compareTo(names[i]) < 0){
                mostAlpha = names[i];
            }
            
        }
        
        return mostAlpha;
    }
            
}
