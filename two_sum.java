import java.util.Arrays;

public class two_sum {
    /*
    https://leetcode.com/problems/two-sum/
     */
    public static void main(String[] args) {
        int[] nums = new int[]{11, 7, 2, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
