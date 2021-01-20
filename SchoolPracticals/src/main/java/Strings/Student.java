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
public class Student {
    private String name;
    private int numFingers;
    private boolean isCool;
    
    private static int numStudents = 0;
    private static String className = "The cool kids";
    
    public Student(String name, int numFingers, boolean isCool){
        this.name = name;
        this.numFingers = numFingers;
        this.isCool = isCool;
        
        this.numStudents++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumFingers() {
        return numFingers;
    }

    public void setNumFingers(int numFingers) {
        this.numFingers = numFingers;
    }

    public boolean isIsCool() {
        return isCool;
    }

    public void setIsCool(boolean isCool) {
        this.isCool = isCool;
    }
    
    public static int getNumStudents(){
        return numStudents;
    }
    
    public static String getClassName(){
        return className;
    }
    
    
//    public static void main (String[] args){
//        Student james = new Student("James", 10, true);
//    }
}
