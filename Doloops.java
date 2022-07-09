import java.util.*;
public class Doloops {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
        int i = 1;
       do {
        System.out.println("enter your marks");
        int marks= sc.nextInt();
        if(marks >=90){
            System.out.println("This is good");
        }
        else if(89 >= marks && marks >= 60){
            System.out.println("This is also Good");
        }
        else if(59 >= marks && marks >= 0) {
            System.out.println("This is Good as well");
        }
            System.out.println("enter 0 for stop,enter 1 for contine");
             i = sc.nextInt();
       }
       while(i>0);
       
    }
}