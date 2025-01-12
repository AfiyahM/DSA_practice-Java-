
import java.util.Scanner;

class Prime {

    public static boolean isPrime(int n) {
        boolean Prime = true;
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                Prime = false;

            }
        }
        return Prime;
    }

    public static void Prime_in_Range(int num) {
        System.out.println("The following are the prime number from range" + num);
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.println(i + "");
            }
        }
        System.out.println();

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num  to check if its prime");
        int n = sc.nextInt();
        System.out.println("the Number is" + isPrime(n));
        System.out.println("Enter the num  to get all the the prime no. in that range");
        int num = sc.nextInt();
        Prime_in_Range(num);

    }
}
