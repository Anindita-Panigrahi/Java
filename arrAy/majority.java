public class majority {
        public static int majorityElement(int[] nums) {
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                int appear = 0;
                for (int j = 0; j < n; j++) {
                    if (nums[i] == nums[j]) {
                        appear++;
                    }
                }
                if (appear > n / 2) {
                    return nums[i];
                }
            }
            return -1; // if no majority element exists
        }
    public static void main(String args[]) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);

    }
}
    

