/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessments.Y2023.Term2;

/**
 *
 * @author Cliftonb
 */
public class LoggerUI {
    public static void main(String[] args) {
        Logger l = new Logger();
        l.sort();
        System.out.println(l.toString());
        
        String username = "Brian";
        int index = l.search(username);
        if(index>0){
            System.out.println("Username " + username + " found at index:" + index);
        }
        else{
            System.out.println("Username " + username + " not found.");
        }
    }
}
