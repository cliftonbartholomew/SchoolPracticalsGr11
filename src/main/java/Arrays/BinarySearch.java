/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Cliftonb
 */
public class BinarySearch {
    public static void main(String[] args) {
        int searchValue = 10;
        
        int [] nums = {1,4,4,7,9,14,19,24,35};
        
        System.out.println(binarySearch(nums, searchValue));
    }
    
    public static int binarySearch(int[] arr, int val){
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end){
            int mid = (start + end)/2;
            
            if(arr[mid] == val){
                return mid;
            }
            else if(arr[mid] > val){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        
        return -1;
    }
}
