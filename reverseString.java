import java.util.*;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);

        }
        if(str.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        System.out.println("Reverrsed String:" + rev);
        sc.close();

    }
}
