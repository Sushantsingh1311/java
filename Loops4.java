import java.util.*;
public class Loops4 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i=2; i<=n; i++) {
        if(i % 2 == 0) {
            System.out.println(i);
        }
    
    }
    for(int i=1; i<=n; i++) {
        if(i%2!=0){
            System.out.println(i);
        }
    }
  }  
}
