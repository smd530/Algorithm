package myleetcode;

/**
 * 颜色分类 lee 75
 *
 * @author shanmingda
 * @date 2020-11-02 22:17
 */
public class SortColors {

    public static void sortColors(int[] nums) {
        int count[] = new int[3];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0 && nums[i] <= 2) {
                count[nums[i]]++;
            }
        }
        int index = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < count[i]; j++) {
                nums[index++] = i;
            }
        }

//        for (int i = 0; i < count[0]; i++) {
//            nums[index++] = 0;
//        }
//        for (int i = 0; i < count[1]; i++) {
//            nums[index++] = 1;
//        }
//        for (int i = 0; i < count[2]; i++) {
//            nums[index++] = 2;
//        }
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        sortColors(arr);


    }
}
