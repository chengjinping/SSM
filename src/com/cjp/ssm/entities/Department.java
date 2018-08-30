package com.cjp.ssm.entities;

public class Department {
	private Integer id;
	private String departmentName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + "]";
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}
