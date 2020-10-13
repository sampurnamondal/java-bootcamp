/*Implementation of serialization*/

package com.sampurna.javabootcamp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serilization {

	public static void main(String[] args) {

		try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("serial"))) {
			Person outputPerson = new Person("Anup", 39, 11);
			System.out.println("Object created : " + " " + outputPerson);
			output.writeObject(outputPerson);
		} catch (IOException e) {
			System.out.println("Exception...");
		}
		
		try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("serial"))){
			Person inputPerson = (Person)input.readObject();
			System.out.println("Object obtained from file : " + " " + inputPerson);
		}catch(IOException e) {
			System.out.println("Exception...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

class Person implements Serializable {
	String name;
	Integer age;
	Integer id;
	private static final long serialversionUID = 123721L;

	Person(String name, Integer age, Integer id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public String toString() {
		return "Name : " + this.name + " " + "Age : " + this.age + " " + "ID : " + this.id;
	}

}
