import java.util.*;
public class updateIth {
    public static int cIth(int n, int i){
        int bitMask= ~(1<<i);
        int value = n & bitMask;
        return (value);
    }
    public static void upIth(int n,int i,int mask){
        n= cIth (n,i) ;
        if (mask==0) {
            int value = (0<<i) | n ;
            System.out.println(value);
        }
        else{
            int value=(1<<i)|n;
            System.out.println(value); //setting ith bit
        }
    }
    public static void main(String args[]){
        System.out.println("enter the number and the bit position");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        System.out.println("now enter value");
        int mask=sc.nextInt();
        upIth(n, i, mask);


    }
}
