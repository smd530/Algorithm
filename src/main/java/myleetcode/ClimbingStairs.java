package myleetcode;

/**
 * 爬楼梯 leetcode 70
 *
 * @author shanmingda
 * @date 2020-09-27 16:10
 */
public class ClimbingStairs {

    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
//        return climbStairs(n - 1) + climbStairs(n - 2);

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }




}
