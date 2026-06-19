import java.util.*;

public class SumTill0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        System.out.println("Enter the number(0 to stop):");
        while (true) {
            num = sc.nextInt();
            if (num == 0) {
                break;

            }
            sum = sum + num;

        }
        System.out.println("sum=" + sum);
        sc.close();
    }

}
