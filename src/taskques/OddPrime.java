package taskques;
import java.util.Scanner;

public class OddPrime {
    public void checkodd(int start, int end) {
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (i < 2) continue;

            boolean isprime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isprime = false;
                    break;
                }
            }

            if (isprime) {
                count++;
                if (count % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }

	public static OddPrime obref() {
		return new OddPrime();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start number:");
		int start=sc.nextInt();
		System.out.println("Enter end number:");
		int end=sc.nextInt();
		OddPrime op=obref();
		op.checkodd(start,end);
		
		
		


	}

}
