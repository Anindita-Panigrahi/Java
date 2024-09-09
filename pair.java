import java.util.*;
public class pair {
    public static void elePair(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.println(arr[i] +" "+ arr[j]);
            }
        }}
        public static void main(String args[]){
            System.out.print("Enter your array size");
            Scanner sc= new Scanner(System.in);
            int arrLen = sc.nextInt();
            int arr[] = new int[arrLen];
            System.out.print("Enter your array");
            for(int i=0;i<arrLen;i++){
                arr[i]=sc.nextInt();
            }
            elePair(arr);
        }
    }

