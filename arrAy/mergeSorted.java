import java.util.Arrays;

public class mergeSorted {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;         // pointer for nums1
        int j = n - 1;         // pointer for nums2
        int k = m + n - 1;     // pointer for end of nums1

        // Merge from the back
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // if any remaining elements copy from nums2 
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        System.out.println("Merged nums1: " + Arrays.toString(nums1));
    }
}
