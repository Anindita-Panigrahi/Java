import java.util.*;
public class linearSearch {
    public static int linear(int arr[], int key){

        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }}
            return -1;
    }
    public static void main(String args[]){
        System.out.print("Enter your array size");
        Scanner sc= new Scanner(System.in);
        int arrLen = sc.nextInt();
        int arr[] = new int[arrLen];
        System.out.print("Enter your array");
        for(int i=0;i<arrLen;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter your key");
        int key = sc.nextInt();
        int index = linear(arr, key);
        if(index == -1){
            System.out.print("Key not found");
        }else{
            System.out.print("Key found at index "+linear(arr,key));
        }

    }
}
