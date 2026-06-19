import java.util.*;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers: ");
        int n = sc.nextInt();
        double sum = 0;
        // Loop run n times to take n inputs
        for (int i = 1; i <= n; i++) {
            // Take input from the user
            System.out.println("Enter number" + i + ": ");
            int num = sc.nextInt();
            // Add the number to running sum
            sum = sum + num;

        }
        double Average = sum / n;
        System.out.println("Average  = " + Average);
        sc.close();

    }

}
