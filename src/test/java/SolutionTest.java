import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {
    @Test
    public void test1(){
        String encodedText = "ch   ie   pr";
        int rows = 3;
        String expected = "cipher";
        String actual = new Solution().decodeCiphertext(encodedText, rows);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        String encodedText = "iveo    eed   l te   olc";
        int rows = 4;
        String expected = "i love leetcode";
        String actual = new Solution().decodeCiphertext(encodedText, rows);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        String encodedText = "coding";
        int rows = 1;
        String expected = "coding";
        String actual = new Solution().decodeCiphertext(encodedText, rows);

        Assert.assertEquals(expected, actual);
    }
}
