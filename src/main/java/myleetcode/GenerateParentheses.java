package myleetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 括号生成 leetcode 22
 *
 * @author shanmingda
 * @date 2020-09-27 16:30
 */
public class GenerateParentheses {

    private static List<String> res = new ArrayList<String>();

    public static List<String> generateParenthesis(int n) {
        generate(0, 0, n, "");
        return res;
    }

    private static void generate(int left, int right, int n, String s) {

        if (left == n && right == n) {
            res.add(s);
            return;
        }

        if (left < n) {
            generate(left + 1, right, n, s + "(");
        }

        if (left > right) {
            generate(left, right + 1, n, s + ")");
        }

    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(5));
    }



}
