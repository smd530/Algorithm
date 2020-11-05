package myleetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和 lee 15
 *
 * @author shanmingda
 * @date 2020-11-04 17:56
 */
public class Threesum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);

        int len = nums.length;
        for (int i = 0; i < len; i++) {
            // 如果 nums[i] > 0 因为已经排好序了 所以后面不可能有三个数字相加大于0直接返回
            if (nums[i] > 0) {
                return lists;
            }
            // 对于重复元素 跳过 避免出现重复解
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int cur = nums[i];
            int L = i+1, R = len-1;

            while (L < R) {
                int temp = cur + nums[L] + nums[R];
                if (temp == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(cur);
                    list.add(nums[L]);
                    list.add(nums[R]);
                    lists.add(list);
                    while (L < R && nums[L-1] == nums[L]) ++L;
                    while (L < R && nums[R-1] == nums[R]) --R;
                    ++L;
                    --R;
                } else if (temp < 0) {
                    ++L;
                } else {
                    --R;
                }
            }
        }

        return lists;
    }

    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};

    }
}
