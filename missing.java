import java.util.*;
class Solution {
    public static void missing(int arr[], int n){
        int a=arr[0];
        for(int i=0;i<n-1;i++){
            if(arr[i]!=a){
                System.out.println(a + ":is the missing number");
            }else{
                a++;
            }
        }
    }

    // Note that the size of the array is n-1
    public static void main(String args[]) {

        // Your Code Here
       
        System.out.print("enter arr size");
       Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n-1];
         System.out.print("enter arr");
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
       
       
        
       missing( arr, n); 
       
    }
}