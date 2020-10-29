package array;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author shanmingda
 * @date 2020-10-29 14:56
 */
public class BinarySearch {

    /**
     * 如何写出正确的程序呢
     *  明确变量的含义
     *  循环不变量（值变 含义不变）
     *  注重小数据量的调试
     *  考虑边界情况
     *
     * 二分查找
     *  目标函数单调性质（单调递增or单调递减）
     *  存在上下界
     *  能够通过索引访问
     *
     * @param arr
     * @param n
     * @param target
     * @return
     */
    public static int binarySearch(int arr[], int n, int target) {
        // 在[l...r]的范围里寻找target
        int l = 0, r = n - 1;
        // 在l == r时 区间[l...r]里还是有元素的 就一个
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            }
            // 右侧 更新左边界
            if (target > arr[mid]) {
                l = mid + 1;

                // 左侧 更新r
            } else {
                r = mid - 1;
            }
        }

        // 当 l > r 返回 -1
        return -1;
    }


    public static void main(String[] args) {

        int arr[] = {5, 7, 7, 8, 8, 9};

        System.out.println(binarySearch(arr, 6, 9));

    }
}
