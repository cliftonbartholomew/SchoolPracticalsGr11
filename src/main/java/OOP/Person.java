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
public class Person {

    
	private String name;
	private int age;
	private double weight;
	private String id;

    public Person(String name, int age, double weight, String id) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
        
    
        
//    public String toString(){
//        return name + ": " +age;
//    }
        
        
        
        public String sayHello(int numTimes){
            String out = "";
            for (int i = 0; i < numTimes; i++) {
                out+= "Hello my name is " + name +"\n";
                
            }
            return out;
        }
        
        
}
