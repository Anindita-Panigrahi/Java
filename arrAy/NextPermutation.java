import java.util.Arrays;

class NextPermutation {
    public static void findNextPermu(int[] nums) {
        int n = nums.length;
        int bPt = -1;

        //Find the breakpoint
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                bPt = i;
                break;
            }
        }

        //for no break point 
        if (bPt == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // the next greater element from the end
        for (int i = n - 1; i > bPt; i--) {
            if (nums[i] > nums[bPt]) {
                int temp = nums[i];
                nums[i] = nums[bPt];
                nums[bPt] = temp;
                break;
            }
        }
        reverse(nums, bPt + 1, n - 1);
    }

    // reverse function
    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 4, 3, 0, 0};

        System.out.println("Original: " + Arrays.toString(nums));
        findNextPermu(nums);
        System.out.println("Next permutation: " + Arrays.toString(nums));
    }
}
