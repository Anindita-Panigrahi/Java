import java.util.Scanner;

public class clearIth {
    public static void cIth(int n, int i){
        int bitMask= ~(1<<i);
        int value = n & bitMask;
        System.out.println(value);

    }
    public static void main(String args[]){
        System.out.println("enter your number");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("enter the position");
        int i= sc.nextInt();
        cIth(n,i);
    }
    
}
