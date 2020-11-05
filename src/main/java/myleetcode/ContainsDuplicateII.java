package myleetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 存在重复元素II 219
 *
 * @author shanmingda
 * @date 2020-11-05 16:01
 */
public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i-k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {


    }
}
