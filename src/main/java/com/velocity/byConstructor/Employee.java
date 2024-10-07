package com.velocity.byConstructor;

public class Employee {
	
	private String name;
	
	//Employee has a Policy
	private Policy policy;
	
	//autowiring using constructor
	//declare a paramaterized constructor 

	public Employee(String name, Policy policy) {
		super();
		this.name = name;
		this.policy = policy;
	}
	//declare a getter method only

	public String getName() {
		return name;
	}

	public Policy getPolicy() {
		return policy;
	}
	public void getData() {
		System.out.println("Employee Name >> "+name);
		System.out.println("Policy Name >> "+policy.getPolicyName());
		System.out.println("Policy Amount >> "+policy.getPolicyAmount());
	}
	
	
	
}
