package ArraysAndHashing;

public class ContainsDuplicate {
    // Brute Force
    // Time: O(n²)
    // Space: O(1)
    public static boolean hasDuplicateBruteForce(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}