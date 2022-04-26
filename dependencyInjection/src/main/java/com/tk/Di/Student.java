package com.tk.Di;

public class Student 
{

	String studentName;	
	String id;

	
//Using setter methods
	
	  
	/*
	 * DEPENDENCY INJECTION BY SETER METHOD
	 * 
	 * public void setStudentName(String studentName)
	 * 
	 * { this.studentName =studentName; }
	 * 
	 * public void setId(String id) { this.id = id; }
	 */
	  
	 
	//DEPENDENCY INJECTION BY SETER METHOD
		public Student(String studentName, String id) 
		{
		this.studentName = studentName;
		this.id = id;
	}

	public void display()
	{
		System.out.println("Student name is :"+ studentName+"id is: "+id);
	}
}
