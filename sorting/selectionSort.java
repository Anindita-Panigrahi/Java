public class selectionSort {
    public static void sort(int nums[]){
        int n= nums.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[min]){
                    min =j;}

                    int temp=nums[min];
                    nums[min]=nums[i];
                    nums[i]=temp;

                
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {13, 46, 24, 52, 20, 9};

        System.out.println("Before sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        sort(nums);

        System.out.println("\nAfter sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    
}
