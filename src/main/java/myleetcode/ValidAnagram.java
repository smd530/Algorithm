package myleetcode;

import java.util.Arrays;

/**
 * 有效的字母异位词
 *
 * @author shanmingda
 * @date 2020-09-16 16:09
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        // 两个字符串不一样长肯定不是异位词
        if (s.length() != t.length()) {
            return false;
        }

        // 解法一 排序
//        char[] sarr = s.toCharArray();
//        char[] tarr = t.toCharArray();
//        Arrays.sort(sarr);
//        Arrays.sort(tarr);
//        return Arrays.equals(sarr, tarr);

        // 解法二 hash

        int [] counter = new int[26];

        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }

        for (int i : counter) {
            if (i != 0) {
                return false;
            }
        }
        return true;

    }




}
