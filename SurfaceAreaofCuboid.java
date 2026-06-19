import java.util.*;
public class SurfaceAreaofCuboid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the side");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of the side");
        int breadth = sc.nextInt();
        System.out.println("Enter the height of the side");
        int height= sc.nextInt();
        int SurfaceArea=2*((length*breadth)+(breadth*height)+(height*length));
        System.out.println(SurfaceArea);
        sc.close();
    }

    
}
