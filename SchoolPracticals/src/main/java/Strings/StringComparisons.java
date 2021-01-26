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
public class StringComparisons {
    public static void main(String[] args) {
        
        //+3 means abc comes first
        System.out.println("def".compareTo("abc"));

        //-3 means abc comes first
        System.out.println("abc".compareTo("def"));

        //0 means they are the same
        System.out.println("abc".compareTo("abc"));
        
        String [] arr = new String[3];
        
        arr[0] = "steve";
        arr[1] = "john";
        arr[2] = "evan";
        
        arr[0].compareTo(arr[1]);
        
        String one = "hello";
        String two = "world";
        
        if(one.equals(two)){
            //do stuff
        }
        
        if(one.compareTo(two) == 0){
            //do stuff
        }
        
        
        
        String name = "John";
        String name2 = "John";
        String name3 = new String("John");
        
        System.out.println("name 1 and 2 == " + (name == name2));
        System.out.println("name 2 and 3 == " + (name2 == name3));
        System.out.println("name 1 and 2 .equals() " + name.equals(name2));
        System.out.println("name 2 and 3 .equals()" + name2.equals(name3));
        
        
        String surname = null;
        System.out.println(surname);
    }
}
