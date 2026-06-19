import java.util.*;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product price:");
        double price = sc.nextDouble();
        System.out.println("Enter the discount percentage:");
        double discountpercent = sc.nextDouble();
        double discountAmount = (price * discountpercent) / 100;
        double finalPrice = price - discountAmount;
        System.out.println("Discount Amount = ₹ " + discountAmount);
        System.out.println("Final Price =₹" + finalPrice);
        sc.close();

    }
}
