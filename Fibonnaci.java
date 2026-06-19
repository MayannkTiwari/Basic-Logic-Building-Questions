import java.util.*;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int f = sc.nextInt();
        int a = 0, b = 1;
        for (int i = 0; i <= f; i++) {
            System.out.println(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        sc.close();
    }

}
