package com.cjp.ssm.entities;

public class Employee {
	private Integer id;
	private String lastName;
	private String gender;
	private String email;
	private Department dept;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", lastName=" + lastName + ", gender=" + gender + ", email=" + email + ", dept="
				+ dept + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
}
