package myleetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两个数组的交集II 350
 * 键值对应
 * @author shanmingda
 * @date 2020-11-04 15:57
 */
public class IntersectionOfTwoArraysII {

    public static int[] intersect(int[] nums1, int[] nums2) {

        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }

        // K 是记录 V 是出现频次
        Map<Integer, Integer> records = new HashMap<>();

        for (int i : nums1) {
            records.put(i, records.getOrDefault(i, 0) + 1);
        }

        int index = 0;
        int intersection[] = new int[nums1.length];


        for (int i : nums2) {
            int count = records.getOrDefault(i, 0 );
            if (count > 0) {
                intersection[index++] = i;
                count--;
                if (count > 0) {
                    records.put(i, count);
                } else {
                    records.remove(i);
                }
            }

        }

        return Arrays.copyOfRange(intersection, 0, index);
    }

    public static void main(String[] args) {
        int nums1[] = {1,2,2,1};
        int nums2[] = {2,2,1};

        intersect(nums1, nums2);
    }


}
