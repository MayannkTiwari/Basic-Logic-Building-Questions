import java.util.*;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first point:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        int distance = Math.abs(a - b);
        System.out.println("the distance is:" + " " + distance);
        sc.close();

    }

}
