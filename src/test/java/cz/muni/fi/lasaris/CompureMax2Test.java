package cz.muni.fi.lasaris;

import org.junit.Assert;
import org.junit.Test;

public class CompureMax2Test {

    private DummyComputeMax dummyComputeMax = new DummyComputeMax();

    @Test
    public void validMaxTest() {
        int[] testArray = new int[]{1, 5, 8, -15, 42, 18, 0};

        int result = dummyComputeMax.computeMax(testArray);
        Assert.assertEquals(42, result);
    }

    @Test
    public void twoMaxTest() {
        int[] array = new int[]{1, 8, 8, -4, 7};

        int result = dummyComputeMax.computeMax(array);
        Assert.assertEquals(8, result);
    }

    @Test
    public void negativeNumsTest() {
        int[] array = new int[]{-7, -5, -3, -17, -1, -9};

        int result = dummyComputeMax.computeMax(array);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void allMaxTest() {
        int[] array = new int[]{1, 1, 1, 1, 1};

        int result = dummyComputeMax.computeMax(array);
        Assert.assertEquals(1, result);
    }
}
