package cz.muni.fi.lasaris;

import org.junit.Assert;
import org.junit.Test;

public class CompureMaxTest {

    private DummyComputeMax dummyComputeMax = new DummyComputeMax();

    @Test
    public void validMaxTest() {
        int[] testArray = new int[]{1, 5, 8, -15, 42, 18, 0};

        int result = dummyComputeMax.computeMax(testArray);
        Assert.assertEquals(42, result);
    }


}
