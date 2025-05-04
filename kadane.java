import java.util.*;

public class kadane {
    public static void max_sum(int arr[]) {
        int sum_total=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum<0){
                sum=0;
            }else if (sum_total<sum) {
                sum_total=sum;
            }
        }
        System.out.println("max sum is"+sum_total);
    }
    public static void main(String arg[]){
        int i=0;
        System.out.print("enter array size");
        Scanner sc= new Scanner(System.in);
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter your array:");
        while(i<s){
            arr[i]=sc.nextInt();
            i++;
        }
        max_sum(arr);
    }
    
}
