public class insertionSort {
    public static void sortHere(int nums[], int n){
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && nums[j-1]>nums[j]){
                int temp=nums[j-1];
                nums[j-1]=nums[j];
                nums[j]=temp;
                j--;
            }
        }
        System.out.println("After insertion sort: ");
    for (int i = 0; i < n; i++) {
        System.out.print(nums[i] + " ");
    }
    System.out.println();
    }
public static void main(String args[]) {
    int arr[] = {13, 46, 24, 52, 20, 9};
    int n = arr.length;
    System.out.println("Before Using insertion Sort: ");
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
    sortHere(arr, n);
}
}
