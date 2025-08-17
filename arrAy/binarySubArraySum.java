public class binarySubArraySum {
    
    //counts subarrays with sum <= goal
    public static int func(int nums[], int goal) {
        if (goal < 0) return 0;

        int l = 0, r = 0;
        int sum = 0, cnt = 0;

        while (r < nums.length) {
            sum += nums[r];

            while (sum > goal) {
                sum -= nums[l];
                l++;
            }

            cnt += (r - l + 1);
            r++;
        }
        return cnt;
    }

    // main function: subarrays with sum == goal
    public static int binarySub(int nums[], int goal) {
        return func(nums, goal) - func(nums, goal - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;

        System.out.println("Number of subarrays with sum = " + goal + " is: " + binarySub(nums, goal));
    }
}
