package com.thymeleafspringbootapplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	/* 🔹 ADD: @NotBlank */
	@NotBlank(message = "First Name is required")
	@Column(name = "first_name")
	private String firstName;
	
	/* 🔹 ADD: @NotBlank */
	@NotBlank(message = "Last Name is required")
	@Column(name = "last_name")
	private String lastName;
	
	/* 🔹 ADD: @NotBlank + @Email */
	@NotBlank(message = "Email is required")
	@Email(message = "Invalid email format")
	@Column(name = "email")
	private String email;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
