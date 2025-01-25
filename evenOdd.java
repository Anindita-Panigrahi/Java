import java.util.*;

public class evenOdd {
    public static void check(int n){
        int res=n&1;
        if(res==1){
            System.out.println("the no is odd");
        }
        else {
            System.out.println("the number is even");
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number");
        int n= sc.nextInt();
        check(n);
    }
}
