/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author Cliftonb
 */
public class StringSearch {
    public static void main(String[] args) {
        String s = "increment";

        s.contains("in");     //true
        s.contains("z"); //false
        s.contains("cent"); // false
        
        
        //"REVERSE of charAt()
        s.indexOf("z"); //-1
        
        s.indexOf("hello"); //-1
        s.indexOf("in");     //0
        s.indexOf("in", 2);  //-1
        
        
        
    }
}
