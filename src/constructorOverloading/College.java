package constructorOverloading;

public class College {
	
	int sId;
	String sName;
	String sAddress;
	String sDepartment;
	String sBloodgroup;
	
	
	int pId;
	String pName;
	String pDepartment;
	int pSalary;
	
	
	
	

	public College(int sId, String sName, String sAddress, String sDepartment, String sBloodgroup) {
		this.sId = sId;
		this.sName = sName;
		this.sAddress = sAddress;
		this.sDepartment = sDepartment;
		this.sBloodgroup = sBloodgroup;
	}
  
	public College(int pId, String pName, String pDepartment, int pSalary) {
		this.pId = pId;
		this.pName = pName;
		this.pDepartment = pDepartment;
		this.pSalary = pSalary;
	}

	void printStudent() {
		System.out.println("This is the detail of the student "+sName);
		System.out.println("-----------------------------------");
		System.out.println("ID:"+sId);
		System.out.println("Name:"+sName);
		System.out.println("Address:"+sAddress);
		System.out.println("Department:"+sDepartment);
		System.out.println("Bloodgroup:"+sBloodgroup);
		System.out.println("-----------------------------------");
		
	}
	void printProff() {
		System.out.println("This is the detail of the Professor"+pName);
		System.out.println("-----------------------------------");
		System.out.println("ID:"+pId);
		System.out.println("Name:"+pName);
		System.out.println("Salary:"+pSalary);
		System.out.println("Department:"+pDepartment);
	}




	public static void main(String[] args) {
		
		College manvi=new College(102,"Manvi","Manglore","AIML","B+");
		College sanvi=new College(103,"Sanvi","Puttur","AIML","B+");
		
		College abhishek=new College(259,"Abhishek","AIML",80000);
		
		manvi.printStudent();
		sanvi.printStudent();
		abhishek.printProff();
	}

}
