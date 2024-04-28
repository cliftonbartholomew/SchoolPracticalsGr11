/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author Cliftonb
 */


//John#18#87.5#1.81
public class Person {
    //fields - object level variables - belong to the objects of the class
    private String name;
    private int age;
    private double weight;
    private double height;
    
     public Person(String inName, int inAge, double inWeight, double inHeight) {
        this.name = inName;
        this.age = inAge;
        this.weight = inWeight;
        this.height = inHeight;
    }
     
     public String getName(){
         return this.name;
     }
     
     public void setName(String newName){
         this.name = newName;
     }
     
     public void setAge(int newAge){
         if(newAge>0){
             this.age = newAge;
         }
     }
     
     public double calculateBMI(){
         return weight/(height*height);
     }
    
     public String generateCode(){
         return this.name.substring(0,3) + (int)(Math.random()*900 + 100);
     }

    //encapsulation
    //bundling of methods and data into objects
    
    //data hiding
    //making certain things private to hide complexity
    //making the useable parts public













    
//    //visibility modifier
//    //public, private, protected, default(package)
//    
//    //static variables - belong to the class
//    public static int numPeople;
//    private static int numPeople2;
//    protected static int numPeople3;
//    static int numPeople4;

   
    
}
