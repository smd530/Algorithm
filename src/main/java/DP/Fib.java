package DP;

import java.lang.reflect.Array;

/**
 * 斐波那契数列 时间复杂度 O(2^n)
 *
 * @author shanmingda
 * @date 2020-10-22 22:39
 */
public class Fib {

    public static int fib(int n) {
        return n <= 1 ? n : fib(n - 1) + fib(n - 2);
    }



    public static void main(String[] args) {
        System.out.println(fib(8));
     }

}


