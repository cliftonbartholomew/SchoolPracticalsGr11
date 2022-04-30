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

	protected String name;
	protected int age;
	protected double weight;
	protected String id;

	public Person(String name, int age, double weight, String id) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.id = id;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(String name) {
		this.name = name;
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

}
