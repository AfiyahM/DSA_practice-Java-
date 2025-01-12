
import java.util.Scanner;

  public class convert_binary_dec {
    public static void binTodec(int n){
        int mynum= n;
        int pow=0;
        int dec=0;
        while(mynum>0){
            int ld=n%10;
            dec=dec+ld*(int)Math.pow(2,pow);
            pow++;
            n=n/10;
        }
        System.out.println("Decimal no.of " + mynum +"is" + dec);
        
    }
    public static void decTobin(int n){
        int mynum= n;
        int pow=0;
        int bin=0;
        while(mynum>0){
            int rem=n%2;
            bin=bin+rem*(int)Math.pow(10,pow);
            pow++;
            n=n/2;
        }
        System.out.println("Decimal no.of " + mynum +"is" + bin);

    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter a binary number");
        int n=s.nextInt();
        binTodec(n);
        System.out.println("Enter a decimal number");
        int m=s.nextInt();
        decTobin(m);
    
}
}