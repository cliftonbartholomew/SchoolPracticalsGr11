/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Cliftonb
 */
public class ArrayBasics2 {
    public static void main(String[] args) {
        int num = 5;
        
        String name = new String("Howsit");
        String name2 = "Howsit";
        
        String[] names = new String[5];
        names[0] = "Bob";
        names[1] = "Steve";
        names[2] = "John";
        names[3] = "Elvis";
        names[4] = "John2";
        
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 5;
        numbers[2] = 15;
        numbers[3] = 1;
        numbers[4] = 12;
        
        double average = (numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4])/5.0;
        
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double avg2 = sum/numbers.length;
        
        //array literal
        int[] numbers2 = {1, 5, 15, 1, 12};
        
        
    }
}
