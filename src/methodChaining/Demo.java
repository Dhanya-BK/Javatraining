package methodChaining;

public class Demo {

	public Demo m1() {
		System.out.println("first method");
		return this;
	}
	public Demo m2() {
		System.out.println("second method");
		return this;
	}
	public Demo m3() {
		System.out.println("third method");
		return this;
	}
	public static void main(String[] args) {
		 Demo d= new Demo();
		d.m1();
		d.m2();
		d.m3();
		System.out.println("-------------------");
		
		//or
		
		d.m1().m2().m3();

	}

}
