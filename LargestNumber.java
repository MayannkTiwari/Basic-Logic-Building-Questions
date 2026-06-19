import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int largest = Integer.MIN_VALUE;
        System.out.println("Enter the Number (0 tp  stop)");
        while (true) {
            num = sc.nextInt();
            if (num == 0) {
                break;

            }
            if (num > largest) {
                largest = num;
            }

        }
        System.out.println("Largest Number = " + largest);
        sc.close();

    }
}
