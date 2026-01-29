package constructorOverloading;

public class Constructorchaining {
	int id;
	String name;
	int age;
	String department;
	String address;
	char sec;
	String bloodgroup;
	String gender;
	String dateofbirth;
	
	Constructorchaining(){
		System.out.println("no argument constructor ");
	}

	Constructorchaining(String name){
		this();
		this.name=name;
	}
	Constructorchaining(String name,int id){
		this();
		this.id=id;
	}
	Constructorchaining(String name,int id,int age){
		this();
		this.id=id;
	}
	Constructorchaining(int id){
		this();
		this.id=id;
	}
	
	

	public static void main(String[] args) {
		

	}

}
