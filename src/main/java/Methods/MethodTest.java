/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author Cliftonb
 */
public class MethodTest {

	public static int outsideNum = 0;

	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 10;
		sayHello();
		int ans = add(num1, num2);
		outsideNum++;

		System.out.println("Ans: " + ans);
	}

	public static void sayHello() {

		System.out.println("Hello");
		outsideNum++;
	}

	public static int add(int i, int j) {
		int sum = i + j;
		return sum;
	}

	public static double interest(double principle, double rate, int numYears) {
		//some calculations
		double ans = 0;
		return ans;
	}

}
