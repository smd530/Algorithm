package sort;

/**
 * 插入排序
 *
 * @author shanmingda
 * @date 2020-11-06 11:26
 */
public class InsertionSort {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        int nums[] = {100, 22, 120, 3};
        insertionSort(nums);

    }

    public static void insertionSort(int nums[]) {

        int n = nums.length;
        // 定义待插入的数
//        int insertVal = nums[1];
//        int insertIndext = 0;

        for (int i = 1; i < n; i++) {
            int insertVal = nums[i];
            int insertIndex = i - 1;

            while (insertIndex >= 0) {
                if (insertVal < nums[insertIndex]) {
                    nums[insertIndex + 1] = nums[insertIndex];
                    insertIndex--;
                } else {
                    break;
                }
            }
            nums[insertIndex + 1] = insertVal;
        }


        for (int num : nums) {
            System.out.println(num);
        }
    }


}
