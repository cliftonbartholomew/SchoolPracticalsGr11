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
public class Student extends Person {

	String[] subjects;

	public Student(String[] subjects, String name, int age, double weight, String id) {
		super(name, age, weight, id);
		this.subjects = subjects;
	}

	public Student(String[] subjects, String name, int age) {
		super(name, age);
		this.subjects = subjects;
	}

	@Override
	public String getName() {
		return "Student: " + name;
	}

	public String getSubject(int i) {
		return subjects[i];
	}

}
