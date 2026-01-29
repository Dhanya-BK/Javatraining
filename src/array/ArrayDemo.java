package array;

public class ArrayDemo {
	public void arrayPrint(int ar[]) {
		for(int i:ar)
			System.out.println(i);
	}

	public static void main(String[] args) {
		int ar[]= {20,40,60,80};
		ArrayDemo a=new ArrayDemo();
		a.arrayPrint(ar);

	}

}
