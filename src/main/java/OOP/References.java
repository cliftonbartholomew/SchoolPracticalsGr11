/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author Cliftonb
 */
public class References {
    public static void main(String[] args) {
        Person p = new Person("simon", 5, 45.6, "1231231");
        Person q = new Person("simon", 5, 45.6, "1231231");
        Person r = p;
        int num = 5;
        int num2 = 5;
        
        
        
        System.out.println("num==num2: " + (num==num2));
        System.out.println("p==q:" + (p==q));
        System.out.println("p==r:" + (p==r));
        
        
        numChanger(num);
        System.out.println("num: " + num);
        
         personChanger(p);
        System.out.println("p.getName(): " + p.getName());
        
    }
    
    public static void numChanger(int num5){
        num5 = 8;
    }
    
    public static void personChanger(Person s){
        s.setName("changed");
    }
}
