import java.util.Scanner;

public class Bitsupdate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();
        // oper = 1 set,  oper = 0 clear
        int n=5;
        int pos=1;

        int BitMask = 1<<pos;

        if(oper==1){
        //set
        int newnumber= BitMask | n;
        System.out.println(newnumber);
        }
        else{
            //clear
            int newBitMask=~(BitMask);
            int newnumber=BitMask & n;
            System.out.println(newnumber);
        }

    }
    
}
