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
public class MathCalc {
    //Static methods ONLY
    //NO FIELDS
    //NO CONSTRUCTOR
    
    //Each operation takes 2 integers - num1 and num2
    //power method
    //multiply method
    //divide method
    
    public static int power(int num1, int num2){
        return (int) Math.pow(num1, num2);
    }
    
    public static int multiply(int num1, int num2){
        return num1*num2;
    }
    
    public static int divide(int num1, int num2){
        return num1/num2;
    }
}
