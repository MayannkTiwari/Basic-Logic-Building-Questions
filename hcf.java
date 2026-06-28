import java.util.*;
public class hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second nummber:");
        int b=sc.nextInt();
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;

        }
        System.out.println("HCF="+ a);
        sc.close();
    }
    
}
