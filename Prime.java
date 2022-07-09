import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            int prime = 0;
        for(int i=2; i<=n-1; i++) {
            if(n%i==0){
                prime++;
            }
        }
        if(prime>0) {
            System.out.println("This number is not prime");
        }
        else {
            System.out.println("This is a prime number");
        }
    }
    
}
