import java.util.*;

public class SumTillX {
    public static void main(String[] args) {
        int sum = 0;
        String input;
        System.out.println("Enter the numbers(enter x to stop):");
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                input = sc.next();
                if (input.equals("5")) {
                    break;
                }
                sum = sum + Integer.parseInt(input);
            }
        }
        System.out.println("Sum = " + sum);
    }
}
