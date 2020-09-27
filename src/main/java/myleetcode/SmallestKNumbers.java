package myleetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 最小的k个数 剑指40
 *
 * @author shanmingda
 * @date 2020-09-17 18:19
 */
public class SmallestKNumbers {


    public int[] getLeastNumbers(int[] arr, int k) {
        // 解法一 暴力 遍历 申请大小为k的新数组 将arr排序 将arr前k个元素塞进新数组
        int[] resArr = new int[k];
//        Arrays.sort(arr);

//        for (int i = 0; i < arr.length; i++) {
//            if (i == k) {
//                break;
//            }
//            resArr[i] = arr[i];
//        }
//        return resArr;

        // 解法二 堆
        PriorityQueue heap = new PriorityQueue();

        for (int i = 0; i < arr.length; i++) {
            heap.add(arr[i]);
        }
        for (int i = 0; i < k; i++) {
            resArr[i] = (Integer) heap.poll();
        }
        return resArr;



    }

    /**
     * @FunctionalInterface 可写可不写 只要保证接口里只有一个方法
     *
     */
    @FunctionalInterface
    interface Foo {
//        public void sayHello();

        public int add(int x, int y);

        public default int mul(int x, int y) {
            return x * y;
        }

        public default int mul2(int x, int y) {
            return x * y;
        }

        public static int div(int x, int y) {
            return x / y;
        }

        public static int div2(int x, int y) {
            return x / y;
        }

    }
    /**
     *  LambdaExpressDemo
     * 1.   函数式接口里有且只能有一个方法
     *      拷贝中括号（拷贝接口里的方法括号）
     *      写死右箭头
     *      落地大括号（里面写业务逻辑方法）
     *      Lambda表达式就是解决了匿名内部类方法融于的语法现象
     * 2.   @FunctionalInterface
     * 3.   default Java8 接口里可以有一定的实现 可以有多个
     * 4.   static 还可以定义静态方法 可以多个
     *
     * 源码举例 Runnable 接口
     *
     * @FunctionalInterface
     * public interface Runnable {
     *     public abstract void run();
     * }
     */
    public static void main(String[] args) {
//        Foo foo = new Foo() {
//            @Override
//            public void sayHello() {
//
//                System.out.println("test....test");
//
//            }
//
//            @Override
//            public int add(int x, int y) {
//                return 0;
//            }
//        };
//
//        foo.sayHello();

//        Foo foo = () -> {
//            System.out.println("test....Lambda");
//        };
//        foo.sayHello();


        Foo foo = (int x, int y) -> {
            System.out.println("test Lambda with param and return");
            return x + y;
        };
        System.out.println(foo.add(1, 2));

        System.out.println(foo.mul(3, 1));

        System.out.println(Foo.div(6, 2));
    }


}
