package BST;

import org.junit.Test;


/**
 * TODO
 *
 * @author shanmingda
 * @date 2020-09-28 17:35
 */
public class BSTTest {

    @Test
    public void test () {

        BST<Integer> bst = new BST<Integer>();
        int [] nums = {5, 3, 6, 8, 4, 2};
        for (int num : nums) {
            bst.add(num);
        }

        bst.preOrder();
        System.out.println();
        System.out.println(bst);
    }

}
