package myleetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 前K个高频元素 leetcode 347
 *
 * @author shanmingda
 */
public class TopkFrequentElements {

    public static int[] topKFrequent(int[] nums, int k) {

        int res[] = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<Map.Entry<Integer, Integer>>((a, b) -> b.getValue()-a.getValue());

        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            maxHeap.add(integerIntegerEntry);
        }

        for (int i = 0; i < k; i++) {
            Map.Entry<Integer, Integer> poll = maxHeap.poll();
            res[i] = poll.getKey();
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[] = {1,1,1,2,2,3};

        int[] ints = topKFrequent(nums, 2);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }



}
