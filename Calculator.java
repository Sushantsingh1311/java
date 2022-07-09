import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Press: 1 = Addition\n Press: 2 Subtraction\n Press: 3 Multiplacti\n Press: 4 Devision\n Press: 5 Modolu ");
        int button = sc.nextInt();

        if(button == 1) {
        System.out.println(a + b);
        }
        else if (button == 2) {
        System.out.println(a - b);
        }
        else if (button == 3) {
        System.out.println(a * b);
        }
        else if (button == 4) {
        System.out.println(a / b);
        }
        else if (button ==5) {
        System.out.println(a % b);
        }
        else {
            System.out.println("Invalid Button");
        }
          }
    
}
