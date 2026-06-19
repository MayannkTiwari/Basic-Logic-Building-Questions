
import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        int sum = 0;
        int product = 1;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            product *= digit;
            n = n / 10;
        }

        int result = product - sum;

        System.out.println("The product of digits: " + product);
        System.out.println("The sum of digits: " + sum);
        System.out.println("The final result: " + result);

        sc.close();
    }
} 
    

