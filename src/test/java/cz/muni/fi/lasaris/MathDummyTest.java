package cz.muni.fi.lasaris;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathDummyTest {

    private MathDummy mathDummy;

    @Before
    public void setUp() {
        mathDummy = new MathDummy();
    }

    @Test
    public void sum() {
        Assert.assertEquals(5, mathDummy.sum(3, 2));
    }

    @Test
    public void extract() {
        Assert.assertEquals(1, mathDummy.extract(3, 2));
    }
}
