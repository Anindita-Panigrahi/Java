public class bubbleSort {
    public static void sortHere(int nums[],int n){
        for(int i=n-1;i>=0;i--){
            int didSwap=0;
            for(int j=0;j<i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    didSwap=1;
                }
            }
            if(didSwap==0) break;
        }
    System.out.println("After bubble sort: ");
    for (int i = 0; i < n; i++) {
        System.out.print(nums[i] + " ");
    }
    System.out.println();
}
public static void main(String args[]) {
    int arr[] = {13, 46, 24, 52, 20, 9};
    int n = arr.length;
    System.out.println("Before Using Bubble Sort: ");
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
    sortHere(arr, n);
}
}


