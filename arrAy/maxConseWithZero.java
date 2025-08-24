public class maxConseWithZero {
    public static int longestOnes(int[] nums, int k) {
        int left = 0, right = 0;
        int zeros = 0, max = 0;

        while (right < nums.length) {
            if (nums[right] == 0) zeros++;

            // Shrink window if too many zeros
            while (zeros > k) {
                if (nums[left] == 0) zeros--;
                left++;
            }

            // Valid window → update max
            max = Math.max(max, right - left + 1);

            right++;
        }

        return max;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] nums1 = {1,1,1,0,0,0,1,1,1,1,0};
        int k1 = 2;
        System.out.println("Output 1: " + longestOnes(nums1, k1)); // Expected 6
    }
}
