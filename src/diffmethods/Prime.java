package diffmethods;

public class Prime {
 
	
	public static boolean isprime(int a) {
		int i;
		if(a<=1)
			return false;
	
			for(i=2;i<=a/2;i++) {
				if(a%i==0)
					return false;
			}
					return true;
						
		}	
		
	
	public static void main(String[] args) {
		int a=23;
		if(isprime(a))
			System.out.println("prime number");
		else
			System.out.println("not prime");

	}

}
