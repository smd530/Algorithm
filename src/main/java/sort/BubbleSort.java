package sort;

/**
 * TODO
 *
 * @author shanmingda
 * @date 2020-11-06 10:28
 */
public class BubbleSort {

    public static void bubblueSort(int nums[]) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - 1; j++) {
                int tem = 0;
                if (nums[j] > nums[j + 1]) {
                    tem = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tem;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]);
        }

    }

    public static void main(String[] args) {
        int nums[] = {11, 3, 4, 6, 22, 9};
        bubblueSort(nums);
    }
}
