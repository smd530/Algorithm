package myleetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 存在重复元素 217 easy
 *
 *
 * @author shanmingda
 * @date 2020-10-30 17:11
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

}
