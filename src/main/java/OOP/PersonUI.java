/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.Scanner;

/**
 *
 * @author Cliftonb
 */
public class PersonUI {
    public static void main(String[] args) {
        int num = 5;//type name value
        
        
        //Object type vs primitive type
        //Static vs non-static
        
        
        
        //static: Person.numOfPeople = 5l;
        //non-static: john.age = 51;
        
        Person john = new Person("John", 18, 38.6, 1.8);

        
        System.out.println("Johns name: " + john.generateCode());
        
        
        //create a scanner
        //while has next
        //read a line
        //create a line scanner
        //break into 4 variables
        //use data to make a person object - Person p = new Person(name, age, weight, height);
        //print person BMI - System.out.println(p.getName() + "s BMI is: " + p.getBMI());
    }
}
