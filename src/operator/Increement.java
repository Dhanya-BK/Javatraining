package operator;

public class Increement {

	public static void main(String[] args) {
		int x=10;
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(++x);
		System.out.println(x);
		System.out.println(++x);
		System.out.println(x);
		System.out.println(++x);
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(x+1);
		System.out.println(x+5);
		System.out.println(++x);
		System.out.println(x+9);
		System.out.println(x++);
		System.out.println(x);
		
		
		int a=10;
		int s=a--*a--+17+ ++a + --a -12*3;
		System.out.println("s:"+s);

	}

}
