package sort;

/**
 * 快排
 *
 * @author shanmingda
 * @date 2020-11-03 11:00
 */
public class QuickSort {

    public static int[] quickSort(int[] array, int begin, int end) {
        if (end <= begin) return array;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot - 1);
        quickSort(array, pivot + 1, end);
        return array;
    }
    static int partition(int[] a, int begin, int end) {
        // pivot: 标杆位置，counter: 小于pivot的元素的个数
        int pivot = end, counter = begin;
        for (int i = begin; i < end; i++) {
            if (a[i] < a[pivot]) {
                int temp = a[counter];
                a[counter] = a[i];
                a[i] = temp;
                counter++;
            }
        }
        int temp = a[pivot];
        a[pivot] = a[counter];
        a[counter] = temp;
        return counter;
    }

    public static void main(String[] args) {
        int arr[] = {10,2,4,1,2,33,5,109,22};
        int[] ints = quickSort(arr, 0, 8);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
