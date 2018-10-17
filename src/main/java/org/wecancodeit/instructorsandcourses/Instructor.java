package org.wecancodeit.instructorsandcourses;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Instructor {
	
	@Id
	@GeneratedValue
	private long id;
	private String firstName;
	private String lastName;
	
	public Instructor() {}
	
	public Instructor(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public long getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	
}
