import java.util.*;
public class evenDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days in the month:");
        int m=sc.nextInt();
        int sum=0;
        for(int i=1;i<=m;i++){
            if (i%2==0) {
                sum++;
                
            }

            
        }
        System.out.println(sum);
        sc.close();
    }

}
