import java.util.*;

public class Findx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your size");
        int size = sc.nextInt();
        
        int numbers[]= new int[size];
        
         


         for(int i=0; i<size; i++){
            System.out.print("enter your number"+ i);
            numbers[i]=sc.nextInt();
        
         }
         System.out.println("enter x");
         int x = sc.nextInt();
        for(int i=0; i<size; i++){
            if (numbers[i]== x){
                System.out.print(i);
            }
        }

    }
    
}
