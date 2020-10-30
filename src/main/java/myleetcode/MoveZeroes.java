package myleetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * TODO
 *
 * @author shanmingda
 */
public class MoveZeroes {

    // 移动 0
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                     nums[i] = 0;
                }
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{0, 1, 3, 0, 4};
        moveZeros2(arr);
    }

    public static void moveZeros2(int arr[]) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                if (i != j) {
                    arr[i] = 0;
                }
                j++;
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }

}
