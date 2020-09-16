package array;

public class array {

    /**
     * 写一个方法 参数为 n 该方法按规律打印值
     * 1*2*3  1*2*3*4
     * 7*8*9  9*10*11*12
     * 4*5*6  13*14*15*16
     *        5*6*7*8
     */


    public static void test(int n) {
        int[][] arr = new int[n][n];
        int a = 1;
        int y = n-1;
        int count = 0;

        for (int i = 0; i < n; i++, y--) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = a++;
            }if (++count == n) {
                break;
            }

            for (int j = 0; j < n; j++) {
                arr[y][j] = a++;
            }
            if (++count == n) {
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(arr[i][j]);
                if (j != n - 1) {
                    System.out.println("*");
                }
            }
        }

    }

    public static void main(String[] args) {
        test(3);
    }
}
