package nonstatic;

public class SumProduct {
	public int sum1(int start,int stop) {
		int sum=0;
	int prod=1;
	for(int i=start;i<=stop;i++) {
		if(i%2==0)
			sum+=i;
		else prod*=i;
		
	}
	return sum+prod;
	}

	public static void main(String[] args) {
		SumProduct sp=new SumProduct();
		int res=sp.sum1(1,4);
		System.out.println(res);

	}

}
