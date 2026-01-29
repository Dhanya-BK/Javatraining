package array;

public class Array1 {
	public void even(int ar[]) {
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0)
				System.out.println(ar[i]);
			
			
		}
		
	}

	public static void main(String[] args) {
		int ar[]= {11,20,30,43};
		Array1 a=new Array1();
		a.even(ar);
		

	}

}
