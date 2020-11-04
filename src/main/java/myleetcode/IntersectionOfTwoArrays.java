package myleetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * TODO
 *
 * @author shanmingda
 * @date 2020-11-04 15:23
 */
public class IntersectionOfTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }

        Set<Integer> records = new HashSet<>();
        Set<Integer> records2 = new HashSet<>();

        for (int i : nums1) {
            records.add(i);

        }

        for (int j : nums2) {
            if (records.contains(j)) {
                records2.add(j);
            }

        }

        int intersection[] = new int[records2.size()];
        int index = 0;
        for (Integer integer : records2) {
            intersection[index++] = integer;
        }
        return intersection;

    }

    public static void main(String[] args) {
        int nums1[] = {4,7,9,7,6,7};
        int nums2[] = {5,0,0,6,1,6,2,2,4};
        int[] intersection = intersection(nums1, nums2);
        for (int i : intersection) {
            System.out.println(i);
        }
    }
}
