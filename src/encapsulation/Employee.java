package encapsulation;

public class Employee {
	int id;
	String name;
	int salary;
	int age;
	
	public int getId() {
		return id;
	}

  public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
   public void printData(String username,int password) {
	   if(username=="user" && password==123) {
		   System.out.println("Name:"+name);
		   System.out.println("ID:"+id);
		   System.out.println("Salary:"+salary);
		   System.out.println("Age:"+age);
	   }
   }


}
