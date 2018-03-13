package com.hubk.studyAutowire;

public class Customer {
	/*public Customer(Person person){
		System.out.println("Customer constructor");
		this.person = person;
	}
	*/
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	public void printPerson(){
		System.out.println(person.getName()+","+person.getAge()+","+person.getAddress());
	}
	
}
