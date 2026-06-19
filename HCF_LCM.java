import java.util.*;

public class HCF_LCM {
    static int hcf(int a, int b) {
        if (b == 0)
            return a;
        return hcf(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number a:");
        int a = sc.nextInt();
        System.out.println("enter the number b:");
        int b = sc.nextInt();
        int hcfValue = hcf(a, b);
        int lcmValue = (a * b) / hcfValue;
        System.out.println("HCF = " + hcfValue);
        System.out.println("LCM = " + lcmValue);

        sc.close();
    }
}
