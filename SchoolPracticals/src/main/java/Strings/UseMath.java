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
public class UseMath {
    public static void main(String[] args) {
        
        System.out.println("3 * 2 = " + MathCalc.multiply(3, 2));
        System.out.println("3 ^ 2 = " + MathCalc.power(3, 2));
        System.out.println("3 / 2 = " + MathCalc.divide(3, 2));
        System.out.println("4 / 7 = " + MathCalc.divide(4, 7));
        
        //MathCalc.divide() - access static method using the class
        // . = the instance operator
        
        
        //mathy.multiply() - access instance methods
        MathCalc2 mathy = new MathCalc2(3, 2);
        System.out.println("3 * 2 = " + mathy.multiply());
        System.out.println("3 ^ 2 = " + mathy.power());
        System.out.println("3 / 2 = " + mathy.divide());
        
        mathy.setNum1(4);
        mathy.setNum2(7);
        System.out.println("4 / 7 = " + mathy.divide());

    }
}
