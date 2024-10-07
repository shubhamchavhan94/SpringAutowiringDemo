package com.velocity.byType;

//both employee and department are dependent on each other
//inject the dependency using autowired byType
public class Employee {
	
	private String name;
	
	//Employee has a department => Has-A relationShip
	private Department department;
	
	//use getter and setter method here
	
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
		System.out.println("Number of Employee >> "+department.getNo_of_employee());
	}
}
