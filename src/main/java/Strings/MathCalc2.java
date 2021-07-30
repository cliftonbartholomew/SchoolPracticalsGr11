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
public class MathCalc2 {
    //Fields and non-static methods only
    //Constructor
    
    
    private int num1;
    private int num2;
    
    public MathCalc2(){
        this.num1 = 0;
        this.num2 = 0;
    }    
    
    //Constructor - instantiate/declare the field variables
    public MathCalc2(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
 
    
    
    public int power(){
        return (int) Math.pow(this.num1, this.num2);
    }
    
    public int multiply(){
        return this.num1 * this.num2;
        
    }
    
    public int divide(){
        return this.num1/ this.num2;
    }
          
    
}
