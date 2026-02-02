package taskques;
import java.util.Scanner;
public class Harshadnum {
	public static void checkdiv(int sum,int temp) {
	if(temp%sum==0)
		System.out.println("Divisible");
	else
		System.out.println("Not divisible");
			
}
	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		while(num!=0) {
			int last=num%10;
			sum+=last;
			num/=10;
		}
		checkdiv(sum,temp);

	}
}


