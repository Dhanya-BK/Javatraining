package taskques;

public class PrimSum {

    static boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i <num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    
    static int getSingleDigit(int num) {
        while (num > 9) {
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {

        int arr[] = {4,37,25,23};

        for (int num : arr) {

            if (isPrime(num)) {

                int finalDigit = getSingleDigit(num);

                if (isPrime(finalDigit)) {
                    System.out.print(finalDigit + " ");
                }
            }
        }
    }
}