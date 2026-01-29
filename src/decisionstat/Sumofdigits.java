package decisionstat;

public class Sumofdigits {

	public static void main(String[] args) {
		int sum=0;
		int num=456;
		while(num>0) {
			int number=num%10;
			num=num/10;
			sum=sum+number;
			
		}
System.out.println("Sum:"+sum);
	}

}
