package myleetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 最小的k个数 剑指40
 *
 * @author shanmingda
 * @date 2020-09-17 18:19
 */
public class SmallestKNumbers {


    public int[] getLeastNumbers(int[] arr, int k) {
        // 解法一 暴力 遍历 申请大小为k的新数组 将arr排序 将arr前k个元素塞进新数组
        int[] resArr = new int[k];
//        Arrays.sort(arr);

//        for (int i = 0; i < arr.length; i++) {
//            if (i == k) {
//                break;
//            }
//            resArr[i] = arr[i];
//        }
//        return resArr;

        // 解法二 堆
        PriorityQueue heap = new PriorityQueue();

        for (int i = 0; i < arr.length; i++) {
            heap.add(arr[i]);
        }
        for (int i = 0; i < k; i++) {
            resArr[i] = (Integer) heap.poll();
        }
        return resArr;



    }




}
