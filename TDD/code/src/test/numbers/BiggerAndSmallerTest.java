package test.numbers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import udemy.numbers.BiggerAndSmaller;

public class BiggerAndSmallerTest {

    private BiggerAndSmaller algorithm;

    @Before
    public void setUp(){
        algorithm = new BiggerAndSmaller();
    }

    @Test
    public void increasingOrder() throws Exception {
        algorithm.find(new int[] {1,2,3,4});

        Assert.assertEquals(algorithm.getBigger(), 4);
        Assert.assertEquals(algorithm.getSmaller(), 1);
    }

    @Test
    public void decreasingOrder() throws Exception {
        algorithm.find(new int[] {4,3,2,1});

        Assert.assertEquals(algorithm.getBigger(), 4);
        Assert.assertEquals(algorithm.getSmaller(), 1);
    }

    @Test
    public void anyOrder() throws Exception {
        algorithm.find(new int[] {3,2,2,1,2,4,3,3});

        Assert.assertEquals(algorithm.getBigger(), 4);
        Assert.assertEquals(algorithm.getSmaller(), 1);
    }

    @Test
    public void onlyOneNumber() throws Exception {
        algorithm.find(new int[] {1});

        Assert.assertEquals(algorithm.getBigger(), 1);
        Assert.assertEquals(algorithm.getSmaller(), 1);
    }
}