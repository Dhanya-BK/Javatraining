package taskques;

public class Alphabet {
	
	public void checkSum(char ar[]) {
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			int k=1;
			for(int j=65;j<91;j++)
				if((int)ar[i]!=j)
					k++;
				else break;
			sum+=k;
		}
		
		System.out.println("The sum of letters position value is "+sum);
		
	}
	public static Alphabet objref() {
		return new Alphabet();
	}

	public static void main(String[] args) {
		char ar[]= {'H','E','L','L','O'};
		Alphabet a=objref();
		a.checkSum(ar);

	}

}
