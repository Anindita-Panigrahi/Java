import java.util.*;
// import java.util.Collections;

//sorting in decending order using inbuild sort
public class inbuiltSort {
    public static void printArr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            }
            System.out.println();
            }    

    public static void main(String args[]){
        Integer arr[]= new Integer[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your array");
        for(int i=0;i<5;i++){
            arr[i]= sc.nextInt(); 
        }
        Arrays.sort(arr,Collections.reverseOrder());
        printArr(arr);
    }
}
//int is primitive type variable while using integer creates object type variable which can be used while using reverse order functions 