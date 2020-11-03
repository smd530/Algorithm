package myleetcode;

/**
 * 两数之合II lee 167
 * 二分
 *
 * @author shanmingda
 * @date 2020-11-03 12:04
 */
public class TwoSumII {

    public static int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        if (numbers.length == 0) {
            return new int[]{-1, -1};
        }

        while (l < r) {
            if (numbers[l] + numbers[r] < target) {
                l++;
            } else if (numbers[l] + numbers[r] > target) {
                r--;
            } else {
                return new int[] {l + 1, r + 1};
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int arr[] = {2,7,11,22,23,24,52,56};
        int target = 59;
        int[] ints = twoSum(arr, target);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

}
