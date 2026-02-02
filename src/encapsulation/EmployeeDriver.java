package encapsulation;

public class EmployeeDriver {

	public static void main(String[] args) {
	Employee e=new Employee();
	e.setId(101);
    e.setName("manvi");
    e.setSalary(80000);
	e.setAge(20);
	
	e.printData("user",123);
	}
	

}
