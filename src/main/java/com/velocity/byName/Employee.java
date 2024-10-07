package com.velocity.byName;

public class Employee {
	//inject dependency using autowiring byName way
	//both employee and department are dependent on each other
	
	private String name;
	
	//Employee has Department
	private Department department;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public void getData() {
		System.out.println("Employee Name >> "+name);
		System.out.println("Department Name >> "+department.getDept_name());
		System.out.println("No of Employee >> "+department.getNo_of_employee());
	}

}
