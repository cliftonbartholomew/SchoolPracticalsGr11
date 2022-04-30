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
public class MyFirstObject {

	private int age;
	private String name;
	private int id;

	public MyFirstObject(int inAge, String inName, int inID) {
		age = inAge;
		name = inName;
		id = inID;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int newAge) {
		if (newAge > 0 && newAge < 150) {
			age = newAge;
		}
	}

	public int getID() {
		return id;
	}

	//overriding
	public String toString() {
		return "";
	}
}
