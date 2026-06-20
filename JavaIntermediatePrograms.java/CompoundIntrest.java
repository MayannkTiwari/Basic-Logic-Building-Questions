import java.util.*;
public class CompoundIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount:");
        double Principal=sc.nextDouble();
        System.out.println("Enter Rate of Intrest:");
        double Rate=sc.nextDouble();
        System.out.println("Enter Time:");
        double Time=sc.nextDouble();
        double Amount = Principal*Math.pow((1+Rate/100),Time);
        double CompoundIntrest = Amount - Principal;
        System.out.println("Compound Intrest:"+CompoundIntrest);
        System.out.println("Total Amount:" + Amount);
        sc.close();

    }
    
}
