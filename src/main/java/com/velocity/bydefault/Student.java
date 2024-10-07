package com.velocity.bydefault;

public class Student {
	
	private String name;
	//Student has subject
	private Subject subject;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	public void getData() {
		System.out.println("Student Name >> "+name);
		System.out.println("Subject Name >> "+subject.getSubject_name());
		System.out.println("Marks >> "+subject.getMarks());
	}
}
