package myleetcode;

import org.junit.Assert;
import org.junit.Test;


/**
 * TODO
 *
 * @author shanmingda
 * @date 2020-09-17 22:33
 */
public class SmallestKNumbersTest {

    @Test
    public void test() {
        SmallestKNumbers smallestKNumbers = new SmallestKNumbers();
        int[] arr = {2,3,1,5,7,6};
        int[] expecteds = {1,2,3};
        Assert.assertArrayEquals(expecteds, smallestKNumbers.getLeastNumbers(arr, 3));
    }

}
