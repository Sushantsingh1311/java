import java.util.*;

public class Radious {
    public static double circumfarance(double radious){
        return 2*3.14*radious;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radious=sc.nextInt();
        System.out.println(circumfarance(radious));

    }

    
    
}
