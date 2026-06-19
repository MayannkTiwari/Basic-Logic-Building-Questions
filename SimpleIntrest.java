import java.util.*;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        int p = sc.nextInt();
        System.out.println("Enter the rate of intrest:");
        int r = sc.nextInt();
        System.out.println("Enter the time:");
        int t = sc.nextInt();
        int SimpleIntrest = (p * r * t) / 100;
        System.out.println(SimpleIntrest + " " + " is the required simple intrest");
        sc.close();
    }

}
