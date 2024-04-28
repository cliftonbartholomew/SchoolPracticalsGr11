/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Cliftonb
 */
public class Sorting2 {
    public static void main(String[] args) {
        int[] arr = {3, 7, 12, 7, 4, 17, 21, 4, 1};
        
        sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        
        System.out.println();
    }
    
    public static void sort(int [] array){
        
        for (int i = array.length - 1; i >= 0; i--) {
            
            for (int j = 0; j < i; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    
                }
                
            }
            
            
        }
    }
            
}
