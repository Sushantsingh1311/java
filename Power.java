package Shortong.Recursion;
import java.util.*;
public class Power {
    public static int calcPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xPowmn1=calcPower(x,n-1);
        int xPown=x*xPowmn1;
        return xPown;
    }
    public static void main(String[] args) {
        int x=2;
        int n=5;
        int ans=calcPower(x, n);
        System.out.println(ans);
        
        
    }
    
}
