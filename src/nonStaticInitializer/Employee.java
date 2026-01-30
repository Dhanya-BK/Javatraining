package nonStaticInitializer;

public class Employee {
	String name;
	int age;
	String address;
	static int salary=10000;
	
	
	public Employee(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public void printData() {
		System.out.println("-----------------");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Address:"+address);
		System.out.println("Salary:"+salary);
	}




	public static void main(String[] args) {
		Employee e1=new Employee("Manvi",15,"Puttur");
		Employee e2=new Employee("Sanvi",10,"Manglore");
		e1.printData();
		e2.printData();
	}

}
