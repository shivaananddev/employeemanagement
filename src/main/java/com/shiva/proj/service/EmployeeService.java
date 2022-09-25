package com.shiva.proj.service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import com.shiva.proj.beans.Employee;

public class EmployeeService {

	HashSet<Employee> empset=new HashSet<Employee>();
	Employee emp1=new Employee(101,"Shiva",24,"IT","Developent",25000);
	Employee emp2=new Employee(102,"Shiva Anand",25,"IT","Developent",25000);
	Employee emp3=new Employee(103,"Jayasree",26,"IT","Developent",25000);
	Employee emp4=new Employee(104,"Mohan",27,"IT","Developent",25000);
	Employee emp5=new Employee(104,"Mohan",27,"IT","Developent",25000);
	Employee emp6=new Employee(104,"Mohan",27,"IT","Developent",25000);
	
	private int id; 
	private String name;
	private int age;
	private String dept;
	private String designation; 
	private double salary;
	
	Scanner sc=new Scanner(System.in);
	
	public EmployeeService()
	{
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
		empset.add(emp5);
		empset.add(emp6);
		
	}
	public void addEmployee()
	{
		System.out.println("Enter EMPID:");
		id=sc.nextInt();
		System.out.println("Enter EMPNAME:");
		name=sc.next();
		System.out.println("Enter EMPAGE:");
		age=sc.nextInt();
		System.out.println("Enter EMPDEPT:");
		dept=sc.next();
		System.out.println("Enter EMP_DESIGNATION:");
		designation=sc.next();
		System.out.println("Enter EMP_SALARY:");
		salary=sc.nextDouble();
		
		Employee insertEmp=new Employee(id,name,age,dept,designation,salary);
		empset.add(insertEmp);
		System.out.println(insertEmp);
	}
	public void viewAllEmployees()
	{
		System.out.println("List of Employess in Shiva Company");
		 Iterator<Employee> it = empset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()+" ");
		}
	}
	public void updateEmployee() {
		boolean found=false;
		System.out.println("Enter the ID to edit:");
		id=sc.nextInt();
		for(Employee emp: empset)
		{
			if(emp.getId()==id)
			{
				System.out.println("Enter EMPID:");
				id=sc.nextInt();
				emp.setId(id);
				System.out.println("Enter EMPNAME:");
				name=sc.next();
				emp.setName(name);
				System.out.println("Enter EMPAGE:");
				age=sc.nextInt();
				emp.setAge(age);
				System.out.println("Enter EMPDEPT:");
				dept=sc.next();
				emp.setDept(dept);
				System.out.println("Enter EMP_DESIGNATION:");
				designation=sc.next();
				emp.setDesignation(designation);
				System.out.println("Enter EMP_SALARY:");
				salary=sc.nextDouble();
				emp.setSalary(salary);
				
				System.out.println(emp);
				found=true;
			}
			
			
		}
		if(!found)
		{
			System.out.println("Please enter valid Employee ID");
		}
		else {
			System.out.println("Employee is being Updated successfully.");
		}
	}
	public void viewEmployee() {
		boolean found=false;
		System.out.println("Enter the ID to view:");
		id=sc.nextInt();
		for(Employee emp: empset)
		{
			if(emp.getId()==id)
			{
				System.out.println(emp);
				found=true;
			}
			
		}
	if(!found)
	{
		System.out.println("Please enter valid Employee ID");
	}
	else {
		System.out.println("Employee is being fetched successfully.");
	}
}
	public void deleteEmployee() {
		boolean found=false;
		System.out.println("Enter the ID to delete:");
		id=sc.nextInt();
		for(Employee emp: empset)
		{
			if(emp.getId()==id)
			{
				empset.remove(emp.getId());
				found=true;
			}
			
		}
	if(!found)
	{
		System.out.println("Please enter valid Employee ID");
	}
	else {
		System.out.println("Employee is being deleted successfully.");
	}
}
}

