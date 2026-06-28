import java.util.*;
public class investment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Initial Investment:");
        double principal= sc.nextInt();
        System.out.println("Enter  Annual Intrest Rate(%):  ");
        double rate=sc.nextDouble();
        System.out.println("Enter Number of Years:");
        int years = sc.nextInt();
        rate = rate/100;
        double futureValue = principal*Math.pow(1+rate,years);
        System.out.println("Future Investment Value = "+ futureValue);
    }
    
}
