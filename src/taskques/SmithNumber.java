package taskques;


import java.util.Scanner;

public class SmithNumber {

    public static void check(int num) {
        int temp = num;
        int sumDigits = 0;

      
        while (temp > 0) {
            sumDigits += temp % 10;
            temp /= 10;
        }

        int sumFactors = 0;
        int n = num;

        
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                
                int factor = i;
                while (factor > 0) {
                    sumFactors += factor % 10;
                    factor /= 10;
                }
                n /= i;
            }
        }

       
        if (sumDigits == sumFactors)
            System.out.println("Equal (Smith Number)");
        else
            System.out.println("Not Equal");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = sc.nextInt();

        check(num);
        sc.close();
    }
}