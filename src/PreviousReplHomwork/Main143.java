package PreviousReplHomwork;
class Employee{
	
	String name;
	String lastName;
	int employeeId;
	String startDate;
	int salary;
	
	public Employee(String name, String lastName, int employeeId, String startDate, int salary) {
		
		this.name=name;
		this.lastName=lastName;
		this.employeeId=employeeId;
		this.startDate=startDate;
		this.salary=salary;
		
		System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
	}
	public Employee() {
		System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
	}
	
}
public class Main143 {

	public static void main(String[] args) {
		Employee emp=new Employee(null, null, 0, null, 0);
		Employee emp1=new Employee("Joe", "Smith", 12345, "01/01/1970", 35000);
	}

}
