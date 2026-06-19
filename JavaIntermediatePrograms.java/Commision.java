import java.util.*;

public class Commision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total cost:");
        double x = sc.nextInt();
        System.out.println("Enter the commision:");
        double c = sc.nextInt();
        double percent = (c / x) * 100;
        System.out.println(percent);
        sc.close();

    }

}
