package myleetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 独一无二的出现次数 1207
 *
 * @author shanmingda
 * @date 2020-11-02 16:26
 */
public class UniqueOccurrences {

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        Set<Integer> set = new HashSet();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            System.out.println(integerIntegerEntry);
            if (set.contains(integerIntegerEntry.getValue())) {
                return false;
            }
            set.add(integerIntegerEntry.getValue());
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,2,1,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
}
