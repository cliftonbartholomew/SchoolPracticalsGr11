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
public class Teacher extends Person {

	private double salary;

	public Teacher(double salary, String name, int age, double weight, String id) {
		super(name, age, weight, id);
		this.salary = salary;
	}

	@Override
	public String getName() {
		return "Teacher: " + name;
	}
}
