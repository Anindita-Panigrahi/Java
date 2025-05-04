import java.util.*;
public class getIth {
    public static void findI (int no, int i){
        int bitmask = 1<<i;
        if((no & bitmask )== 1){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        } 

    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number ");
        int no = sc.nextInt();
        System.out.println("now enter index:");
        int ind= sc.nextInt();
        findI (no,ind);
    }
}
