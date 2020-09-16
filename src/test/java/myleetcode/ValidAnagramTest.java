package myleetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * TODO
 *
 * @author shanmingda
 * @date 2020-09-16 16:20
 */
public class ValidAnagramTest {

    @Test
    public void test () {

        ValidAnagram validAnagram = new ValidAnagram();
        Assert.assertTrue(validAnagram.isAnagram("abcdefg", "bcadfge"));
    }

}
