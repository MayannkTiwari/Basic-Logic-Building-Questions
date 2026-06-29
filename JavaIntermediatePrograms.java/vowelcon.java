import java.util.*;

public class vowelcon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + "is a vowel");

            } else {
                System.out.println(ch + "is a Consonant");

            }

        } else {
            System.out.println("Invalid Input! Please enter an alphabet");

        }
        sc.close();

    }

}
