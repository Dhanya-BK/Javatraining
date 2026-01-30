package taskques;

public class Allnum {
	public static void checknum(int num) {
		int num1=num*2;
		int num2=num*3;
		int i=0;
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		int count6=0;
		int count7=0;
		int count8=0;
		int count9=0;
		int ar[]=new int[9];
		while(num!=0) {
			int last=num%10;
			ar[i]=last;
			i++;
			num/=10;
		}
		while(num1!=0) {
			int last=num1%10;
			ar[i]=last;
			i++;
			num1/=10;
		}
		while(num2!=0) {
			int last=num2%10;
			ar[i]=last;
			i++;
			num2/=10;
		}
		
		for(i=0;i<ar.length;i++) {
			if(ar[i]==1) count1++;
			else if(ar[i]==2) count2++;
			else if(ar[i]==3) count3++;
			else if(ar[i]==4) count4++;
			else if(ar[i]==5) count5++;
			else if(ar[i]==6) count6++;
			else if(ar[i]==7) count7++;
			else if(ar[i]==8) count8++;
			else if(ar[i]==9) count9++;
		}
			
			if(count1==1 && count2==1 && count3==1 && count4==1 && count5==1 && count6==1 && count7==1 && 
					count8==1 && count9==1)
				System.out.println("It is Fascinating number");
			else
				System.out.println("Not Fascinating number");
		}
	

	public static void main(String[] args) {
		int num=192;
		checknum(num);
		

	}

}

