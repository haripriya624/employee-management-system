package Emp;
import java.util.*;

import Asset.Admin;
import Asset.Adminimplementation;
import Asset.Admininterface;
public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		EmployeeDaoIntrf dao=new EmployeeDaoImpl();
		System.out.println("Welcome to Employee management system");
		System.out.println("---------------------------------------");
		Scanner sc=new Scanner(System.in);
		
//		System.out.println("1. ADMIN LOGIN");
//		System.out.println("2. USER LOGIN");
//		System.out.println("Enter your choice");
//		int choice=sc.nextInt();
		
//		switch(choice) {
//		case 1:
//			System.out.println("Admin login credentials");
//			System.out.println("Enter username: ");
//			String username=sc.next();
//			System.out.println("Enter password: ");
//			String password=sc.next();
//			Admininterface ad=new Adminimplementation();
//
//		Admin a = ad.Login(username, password);
//		if(a==null)
//		{
//			System.out.println("wrong credentials");
//			System.out.println("------------------");
//			break;
//		}
//		System.out.println("login successfull");
		do 
		{
			System.out.print("1. Add employee\n" +
							"2. Show all Employee details\n" +
							"3. Show Employee based on id \n" +
							"4. Show Employee based on salary \n"+
							"5. Update the employee\n" +
							"6. Delete the employee\n" +
							"7. Exit\n");
			System.out.println("Enter choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				Employee emp=new Employee();
				System.out.println("Enter ID: ");
				int id=sc.nextInt();
				System.out.println("Enter Name: ");
				String name=sc.next();
				System.out.println("Enter Salary: ");
				double salary=sc.nextDouble();
				System.out.println("Enter Age: ");
				int age=sc.nextInt();
				emp.setId(id);
				emp.setName(name);
				emp.setSalary(salary);
				emp.setAge(age);
				dao.createEmployee(emp);
				break;
			case 2:
				dao.showAllEmployee();
				break;
			case 3:
				System.out.println("Enter id to show the details ");
				int empid=sc.nextInt();
				dao.showEmployeeBasedOnId(empid);
				break;
			case 4:
				System.out.println("Enter salary to show the details ");
				int empsalary=sc.nextInt();
				dao.showEmployeeBasedOnSalary(empsalary);
				break;
			case 5:
				System.out.println("Enter id to update the details ");
				int empid1=sc.nextInt();
				System.out.println("Enter the new Name ");
				String Name=sc.next();
				dao.updateEmployee(empid1,Name);
				break;
			case 6:
				System.out.println("Enter id to delete ");
				int Id=sc.nextInt();
				dao.deleteEmployee(Id);
				break;
			case 7:
				System.out.println("Thank you for using our Application!!!");
				System.exit(0);
			default:
				System.out.print("Enter valid choice");
				break;
			}
		}while(true);
//		}
	}
	
}