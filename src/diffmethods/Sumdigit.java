package diffmethods;

public class Sumdigit {
	
	public static void digit(int a) {
		int sum=0;
		while(a>0) {
			int num=a%10;
			sum=sum+num;
			a=a/10;
		}
		System.out.println("sum is "+sum);
	}

	public static void main(String[] args) {
		digit(125);

	}

}
