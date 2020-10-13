/*Make a class immutable*/

package com.sampurna.javabootcamp;

//final class
final class ImmutableEngineer {

	// final variables
	final private Integer id;
	final private Name name;
	final private String role;

	// values assigned in constructors only
	ImmutableEngineer(Integer id, Name name, String role) {

		this.id = id;
		// this.name = name;
		this.role = role;
		// deep copy for mutable obj
		Name cloneName = new Name();
		cloneName.setFirstName(name.getFirstName());
		cloneName.setLastName(name.getLastName());
		this.name = cloneName;
	}

	// no setters

	public Integer getId() {
		return id;
	}

	public Name getName() {
		// return name;
		// return deep copy for getter of mutable obj
		Name cloneName = new Name();
		cloneName.setFirstName(name.getFirstName());
		cloneName.setLastName(name.getLastName());

		return cloneName;
	}

	public String getRole() {
		return role;
	}
}

class Name {

	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}

public class ImmutableTest {

	public static void main(String[] args) {

		Name name = new Name();
		name.setFirstName("AFirst");
		name.setLastName("ALastName");
		ImmutableEngineer engineer = new ImmutableEngineer(9, name, "Junior");
		System.out.println("Junior" == engineer.getRole());
		System.out.println("Before : " + engineer.getName().getFirstName());
		engineer.getName().setFirstName("AAFirst");
		System.out.println("After : " + engineer.getName().getFirstName());

	}

}
