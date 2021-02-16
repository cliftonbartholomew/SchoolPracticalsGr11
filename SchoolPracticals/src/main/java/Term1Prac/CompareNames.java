/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Term1Prac;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class CompareNames {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter in a name: ");
        
        String output = input;
        
        //Ask for 4 more inputs
        for(int i = 0; i < 4; i++){
            input = JOptionPane.showInputDialog("Enter in a name: ");
            
            //returns < 0 if the compared to string comes first
            //returns > 0 if the compared to string comes second
            //think   a - z < 0
            //think   z - a > 0
            if(input.compareTo(output) < 0){
                output = input;
            }
        }
        
        System.out.println("The first name alphabetically is: " + output);
    }
}
