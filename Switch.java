import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Button = sc.nextInt();

        switch(Button) {
         case 1 : System.out.println("Helli");
         break;
         case 2 : System.out.println("Namaste");
         break;
         case 3 : System.out.println("Bonjout");
         break;
         default : System.out.println("Invalid Button");   
        }


    }
    
}
