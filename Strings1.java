import java.util.*;
public class Strings1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //concatination
        String firstname="Sustant";
        String lastname="raja";
        String fullname=firstname + "@" + lastname;
        //Sushant@raja
        System.out.println(fullname + " ");
       //length
       System.out.println(fullname.length()); 
       //charAt
       for(int i=0; i<fullname.length(); i++){
        System.out.println(fullname.charAt(i));
       }   
     }
    
}
