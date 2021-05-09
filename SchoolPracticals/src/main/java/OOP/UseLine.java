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
public class UseLine {

	public static void main(String[] args) {
		int num = 10;
		String s = "Hello world";
		//10 and ^ are actual paramters

		Line line1 = new Line(10, '^');
		line1.draw();
		System.out.println(Line.getNumLines());
		System.out.println(line1);
	}

}
