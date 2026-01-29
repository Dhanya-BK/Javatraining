package constructorOverloading;

public class Flipkart {
	
	int sId;
	String sName;
	String sAddress;
	String sProduct;
	
	
	int uId;
	String uName;
	String uAddress;
	String uProduct;
	int uPrice;
	
	

	public Flipkart(int sId, String sName, String sAddress, String sProduct) {
		this.sId = sId;
		this.sName = sName;
		this.sAddress = sAddress;
		this.sProduct = sProduct;
		
	}
	
	public Flipkart(int uId, String uName, String uAddress, String uProduct, int uPrice) {
		this.uId = uId;
		this.uName = uName;
		this.uAddress = uAddress;
		this.uProduct = uProduct;
		this.uPrice = uPrice;
	}
	
	void printSeller() {
		System.out.println("This is the detail of the seller "+sName);
		System.out.println("-----------------------------------");
		System.out.println("ID:"+sId);
		System.out.println("Name:"+sName);
		System.out.println("Address:"+sAddress);
		System.out.println("Product:"+sProduct);
		System.out.println("-----------------------------------");
		
	}
	void printUser() {
		System.out.println("This is the detail of the Enduser "+uName);
		System.out.println("-----------------------------------");
		System.out.println("ID:"+uId);
		System.out.println("Name:"+uName);
		System.out.println("Address:"+uAddress);
		System.out.println("Product:"+uProduct);
		System.out.println("Price:"+uPrice);
	}
	
public static void main(String[] args) {
	Flipkart abc=new Flipkart(501,"ABC Supplier","Jaipur","HandBag");
	Flipkart xyz=new Flipkart(806,"XYZ Suppliers","Surat","Kurtha");
	
	Flipkart dhruvi=new Flipkart(259,"Dhruvi","Puttur","Laptop",80000);
	
	abc.printSeller();
	xyz.printSeller();
	dhruvi.printUser();
		

	}

}
