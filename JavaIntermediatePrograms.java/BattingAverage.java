import java.util.*;
public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the run scored:");
        int r= sc.nextInt();
        System.out.println("Enter the number of balls:");
        int b=sc.nextInt();
        double BattingAverage=(double)(r/b)*100;
        System.out.println("The Batting Average is:"+BattingAverage);
        sc.close();
    }
    
}
