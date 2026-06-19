import java.util.*;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Enter the power:");
        int p = sc.nextInt();

        double power = Math.pow(n, p);
        System.out.println("ANSWER:" + " " + power);
        sc.close();

    }

}
