import java.util.*;

public class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> st = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            Set<Integer> hashset = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) {
                int third = -(nums[i] + nums[j]);

                if (hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    temp.sort(null);
                    st.add(temp);
                }

                hashset.add(nums[j]);
            }
        }

        return new ArrayList<>(st);
    }

    public static void main(String[] args) {
        threeSum sol = new threeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};

        System.out.println(sol.threeSum(nums));
    }
}
