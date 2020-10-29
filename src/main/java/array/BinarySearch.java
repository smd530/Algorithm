package array;

/**
 * TODO
 *
 * @author shanmingda
 * @date 2020-10-29 14:56
 */
public class BinarySearch {


    public static int binarySearch(int arr[], int n, int target) {
        // 在[l...r]的范围里寻找target
        int l = 0, r = n - 1;
        // 在l == r时 区间[l...r]里还是有元素的 就一个
        while (l <= r) {
            int mid = (l + r)/2;
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

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(binarySearch(arr, 10, 9));
    }
}
