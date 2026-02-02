package taskques;

public class Sumprod {

	public static void main(String[] args) {
	int sum=0;
	int prod=1;
        int i=0;
		int count=0;
		int num=1224;
		int temp=num;
		while(temp!=0) {
			count++;
			temp/=10;
		}
		int ar[]=new int[count];
		while(num!=0) {
			int last=num%10;
			ar[i]=last;
			i++;
			num/=10;
		}
		for(i=0;i<ar.length;i++) {
			if(i==0 || i==(ar.length)-1)
				prod*=ar[i];
			else
				sum+=ar[i];
		}
		if(sum==prod)
			System.out.println("equal");
		else 
			System.out.println("not equal");
	}
}
		
			
		