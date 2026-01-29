package diffmethods;

public class Numdig {

	public static void number(int a) {
		int count=0;
		while(a>0) {
			int num=a%10;
			a=a/10;
			if(num!=0)
				count++;
		}
			System.out.println("number of digits:"+count);
			
		}
		
	

	public static void main(String[] args) {
		number(12465);

	}


	}


