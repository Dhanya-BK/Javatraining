package acceptObject;

public class Armstrong {
	public static void sum(int num) {
		
		int sum1=0;
		int number=num;
		int temp=num;
		int pow=0;
		while(num!=0) {
			
			num=num/10;
			pow++;
		}
		System.out.println(pow);

	while(number!=0) {
		int last=number%10;
		int res=1;
		for(int i=1;i<=pow;i++)
			res=res*last;
		sum1+=res;
		//last=0;
		number=number/10;
	}
	if(sum1==temp)
		System.out.println("Armstrong no.");
	else
		System.out.println("Not Armstrong");
		
		
	}

	public static void main(String[] args) {
		sum(153);
		

	}

}
