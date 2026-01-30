package taskques;
import java.util.Scanner;

public class Lucky {
	public static void check(int sum,int temp) {
		int res=0;
		while(sum!=0) {
			if(sum>0) {
				int last=sum%10;
				res=res+last;
				sum=sum/10;
			}
		}
		System.out.println("res:"+res);
		if(res==temp)
			System.out.println("Lucky");
		else
			System.out.println("Not Lucky");
		}

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the dob:");
		int dob=sc.nextInt();
		int year=dob%10000;
		dob=dob/10000;
		int month=dob%100;
		dob/=100;
		int date=dob;
		int temp=date;
		System.out.println("Year:"+year);
		System.out.println("month:"+month);
		System.out.println("date:"+date);
		while(year!=0) {
			
				int lasty=year%10;
				sum+=lasty;
				year/=10;
			
		}
		while(month!=0) {
			
				int lastm=month%10;
				sum+=lastm;
				month/=10;
			
		}
		while(date!= 0) {
			
				int lastd=date%10;
				sum+=lastd;
				date/=10;
			
		}
		System.out.println(sum);
		check(sum,temp);
		
		

	}

}
