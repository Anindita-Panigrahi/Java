public class searchPosition {
    public static int searchInsert(int nums[], int target){
        int head=0;
        int tail=nums.length-1;
        while(head<=tail){
            int mid = head + (tail-head) / 2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                head= mid + 1;
            }else {
                tail = mid-1;
            }
        }return head;

    }
    public static void main(String args[]){
        int[] nums = {1, 3, 5, 6};
        int target = 5;

        int result = searchInsert(nums, target);

        System.out.println("Index: " + result);
    }
}
