import java.util.*;
public class Strings2 {
    public static void main(String[] args) {
        //compare
        String name1="Sushant";
        String name2="Sushant";
        
        //1   s1>s2=+ve;
        //2   s1=s2=0;
        // 3   s1<s2=-ve;
          if(name1.compareTo(name2)==0) {
         System.out.println("String are equal");
         } 
         else{
         System.out.println("String are NOT eqal");
         }
        //but not work all time so use "compareTO"
        // if(name1==name2) {
        //     System.out.println("String are equal");
        //    } 
        //    else{
        //    System.out.println("String are NOT eqal");
        //    }

        //  if(new String("Sushant")==new String("Sushant")) {
        //     System.out.println("String are equal");
        //    } 
        //    else{
        //    System.out.println("String are NOT eqal");
        // }
    }
    
}
