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


    public static int[] getLeastNumbers(int[] arr, int k) {

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
        // 优先队列 默认是小顶堆
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        // 优先队列 大顶堆实现
        PriorityQueue<Integer> heap1 = new PriorityQueue<>((o1, o2) -> o2 - o1);


        for (int i : arr) {
            heap.add(i);
        }
        for (int i = 0; i < k; i++) {
            Integer poll = heap.poll();
            resArr[i] = poll;
        }
        return resArr;

    }

    public static void main(String[] args) {

        int arr[] = {3, 2, 1};
        int k = 2;
        int[] numbers = getLeastNumbers(arr, k);
        for (int number : numbers) {
            System.out.println(number);
        }
    }



}
