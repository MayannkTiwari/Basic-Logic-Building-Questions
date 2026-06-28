import java.util.*;
public class panc {
    public static long factorial(int n){
        long fact =1;
        for(int i=1;i<n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter r:");
        int r= sc.nextInt();
        if(r>n||n<0||r<0){
            System.out.println("Invalid Inputs:");
            return;
        }
        long nCr = factorial(n)/(factorial(r)*factorial(n-r));
        long nPr = factorial(n)/factorial(n-r);

        System.out.println("nCr="+nCr);
        System.out.println("nPr ="+ nPr);

        sc.close();

        
    }
}
