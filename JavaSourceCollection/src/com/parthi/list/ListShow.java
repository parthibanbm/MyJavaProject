package com.parthi.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
	
	String name;
	int age;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
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

	@Override
	public int compareTo(Person o) {
		
		//while compare we need 2 object
		//this > o
		
		if(this.getAge() < o.getAge())
			return -1;
		if(this.getAge() > o.getAge())
			return 1;
		return 0;
	}

	
	
	
	
}

public class ListShow {

	public static void main(String[] args) {
		
		List<Person> personDetails = new ArrayList<>();		
		personDetails.add(new Person("parthi",34));
		personDetails.add(new Person("suresh",31));
		personDetails.add(new Person("dinesh",30));
		personDetails.add(new Person("ashwin",37));
		
		Collections.sort(personDetails);
		
		for(Person p1 : personDetails)
		{
			System.out.println(p1.getName() +" "+ p1.getAge());
		}
		

	}

}
