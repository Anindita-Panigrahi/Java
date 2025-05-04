
import java.util.*;

public class bubble {

    public static void sorting(int array[]) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1- i; j++) {

                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        printArr(array);
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length; i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int array[] = { 5, 4, 1, 3, 2 };
        sorting(array);
      
    }

}
