package array;

public class ArrayEven {

	public int[] evenCheck(int ar) {
		int count=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0)
				count++;
		}
		int ar1[]=new int[count];
		int start=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0) {
				ar1[start++]=ar[i];
			}
	}
		return ar1;		
		
	}
	public static ArrayEven objRef() {
		return new.ArrayEven();
	}
	public static void main(String[] args) {
		

	}

}
