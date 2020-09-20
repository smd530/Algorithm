package myleetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author shanmingda
 * @date 2020-09-13 22:51
 */
public class TwoSum {

    // 暴力双重for loop
    public int[] getTwoNumSumWithBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

    // Hash
    public int[] getTwoNumSumWithHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i <= nums.length; i++) {
            int needNum = target - nums[i];
            if (map.containsKey(needNum)) {
                return new int[]{map.get(needNum), i};
            }
            map.put(nums[i], i);
        }
        return new int [] {-1, -1};
    }

}
