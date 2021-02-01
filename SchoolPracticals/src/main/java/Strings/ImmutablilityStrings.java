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
public class ImmutablilityStrings {
    public static void main(String[] args) {
       
        //creates a new string object, and stores the reference in name.
        String name = "Clifton"; 
       
        
        //You can never edit chars in the "Clifton" string object
        //name[3] = 't'
        
        
        //creates a new string object, and stores the reference in name.
        //"Clifton" object is still in memory but with no reference. It eventually
        //gets deleted.
        name = "James";
        
        name = name.substring(0,2);
        
        System.out.println(name);
        
    }
    
    
    
}
