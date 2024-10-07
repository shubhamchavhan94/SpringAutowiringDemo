package com.velocity.byConstructor;

public class Policy {

	private String policyName;
	private int policyAmount;
	
	//paramaterized constructor
	
	public Policy(String policyName, int policyAmount) {
		super();
		this.policyName = policyName;
		this.policyAmount = policyAmount;
	}
	//declare a getter method only

	public String getPolicyName() {
		return policyName;
	}

	public int getPolicyAmount() {
		return policyAmount;
	}
	
	
}
