package diffmethods;

public class Oddprime{
	
		    static boolean isOdd(int num) {
		        return num % 2 != 0;
		    }

		    
		    static boolean isPrime(int num) {
		        if (num <= 1)
		            return false;

		        for (int i = 2; i <= num / 2; i++) {
		            if (num % i == 0)
		                return false;
		        }
		        return true;
		    }

		    public static void main(String[] args) {

		        int num = 17;   

		        if (isOdd(num)) {
		            System.out.println(num + " is Odd");

		            if (isPrime(num))
		                System.out.println(num + " is Prime");
		            else
		                System.out.println(num + " is Not Prime");

		        } else {
		            System.out.println(num + " is Even");
		        }
		    }
		}

