package myleetcode;

import java.util.Arrays;

/**
 * 最小的k个数 剑指40
 *
 * @author shanmingda
 * @date 2020-09-17 18:19
 */
public class SmallestKNumbers {

    // 解法一 暴力 遍历 申请大小为k的新数组 将arr排序 将arr前k个元素塞进新数组

    public static int[] getLeastNumbers(int[] arr, int k) {

        Arrays.sort(arr);
        int[] resArr = new int[k];

        for (int i = 0; i < arr.length; i++) {
            if (i == k) {
                break;
            }
            resArr[i] = arr[i];
        }
        return resArr;
    }

    public static void main(String[] args) {
        int [] arr = {2,3,4,5,9,7,1};
        int k = 3;

        int[] numbers = getLeastNumbers(arr, k);
        for (int number : numbers) {
            System.out.println(number);
        }
    }


}
