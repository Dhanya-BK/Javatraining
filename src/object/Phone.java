package object;

public class Phone {
	
	String name;
	float display;
	int battery;
	int RAM;
	int ROM;
	
	Phone(String name1,float display1,int battery1,int RAM1,int ROM1){
		name=name1;
		display=display1;
		battery=battery1;
		RAM=RAM1;
		ROM=ROM1;
		
	}

	public static void main(String[] args) {
		Phone nothing=new Phone("Nothing 2a",5.8f,5000,8,128);
		Phone vivo=new Phone("Vivo",6.1f,5000,16,256);
		Phone oppo=new Phone("Oppo",5.6f,6000,8,256);
		
		
		System.out.println(nothing.name);
		System.out.println(nothing.display);
		System.out.println(nothing.battery);
		System.out.println(nothing.RAM);
		System.out.println(nothing.ROM);
		System.out.println("------------------");
		
		System.out.println(vivo.name);
		System.out.println(vivo.display);
		System.out.println(vivo.battery);
		System.out.println(vivo.RAM);
		System.out.println(vivo.ROM);
		System.out.println("------------------");
		
		System.out.println(oppo.name);
		System.out.println(oppo.display);
		System.out.println(oppo.battery);
		System.out.println(oppo.RAM);
		System.out.println(oppo.ROM);
		
				
		

	}

}
