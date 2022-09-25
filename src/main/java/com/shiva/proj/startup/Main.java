package com.shiva.proj.startup;

import java.util.Scanner;

import com.shiva.proj.service.EmployeeService;

public class Main {

	
	public Main() {
		// TODO Auto-generated constructor stub
	}
	public static void menu()
	{
		System.out.println("\n\n************Welcome Student Management***********"
				+ "\n1. Add Employee"
				+ "\n2. View Employee"
				+ "\n3. Update Employee"
				+ "\n4. Delete Employee"
				+ "\n5. View All Employee"
				+ "\n6. Exit"
				+ "\nPlease Enter You Choices");
	}

	public static void main(String[] args) {
		EmployeeService empserv=new EmployeeService();
		boolean ordering=true;
		
		Scanner sc=new Scanner(System.in);
		int choice;
		
		do {
			Main.menu();
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				empserv.addEmployee();		
				//ordering =false;
				break;
			case 2:
				empserv.viewEmployee();	
				//ordering =false;
				break;
				
			case 3: 
				empserv.updateEmployee();
				break;
				//ordering =false;
			case 4: 
				empserv.deleteEmployee();
				//ordering =false;
				break;
			case 5: 
				empserv.viewAllEmployees();
				//ordering =false;
				break;
			case 6: 
				System.out.println("Thanks for Using Shiva's Employee Management Software!!");
				ordering =false;
				break;
			default: System.out.println("Enter Valid Input");
			}
			
		}while(ordering);

	}

}
