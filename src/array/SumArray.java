package array;

public class SumArray {
	public void demo() {
		int ar[]= {10,20,30,40};
		for(int i=0;i<ar.length;i++) {
			 ar[i]=2*ar[i];
			
		}
		for(int d:ar)
			System.out.println(d);
	}
	public static SumArray obref() {
		return new SumArray();
	
	}

	public static void main(String[] args) {
		obref().demo();
	

	}

}
