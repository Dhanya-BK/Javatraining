package diffmethods;

public class Evenodd {
	
		public static boolean check(int num) {
			if((num&1)==0) return true;
			else return false;
		}

	public static void main(String[] args) {
		int num=48;
		   if(check(num))
			   System.out.println("number is even");
		   else
			   System.out.println("number is odd");
		
		
	}
}
	
	


