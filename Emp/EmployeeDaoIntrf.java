package Emp;

public interface EmployeeDaoIntrf {
	
	public void createEmployee(Employee emp); 
	public void showAllEmployee();
	public void showEmployeeBasedOnId(int id);
	public void showEmployeeBasedOnSalary(int salary);
	public void updateEmployee(int id,String name);
	public void deleteEmployee(int id);
}
