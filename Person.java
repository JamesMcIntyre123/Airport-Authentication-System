/*
 * CMS 270
 * Abstract Person super class
 * 4/21/22
 * Nicole E, James M, Valeria E, Shaan C
 */

public abstract class Person {

	//Data members
	private String name;
	private String birthDate;
	private String address;

	//Constructor
	public Person(String n, String b, String a) {
		name = n;
		birthDate = b;
		address = a;
	}

	//Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String b) {
		birthDate = b;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String a) {
		address = a;
	}
}