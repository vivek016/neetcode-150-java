package ArraysAndHashing;

import java.util.HashSet;

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

    // Optimal
    // Time: O(n) average
    // Space: O(n)
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }

            seen.add(num);
        }

        return false;
    }
}