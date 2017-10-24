package cz.muni.fi.lasaris;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author <a href="mailto:xstefank122@gmail.com">Martin Stefanko</a>
 */
public class DummyTest {

    private Dummy dummy;

    @Before
    public void before() {
        dummy = new Dummy();
    }

    @Test
    public void kashyyykTest() {
        Assert.assertEquals("kashyyyk", dummy.kashyyyk());
    }

    @Test
    public void tatooineTest() {
        Assert.assertEquals("tatooine", dummy.tatooine());
    }

    @Test
    public void alwaysLowerTest() {
//        Assert.assertTrue(dummy.alwaysLower(Integer.MAX_VALUE));
        dummy.alwaysLower(Integer.MAX_VALUE);
    }

    @Test
    public void plusOneTest() {
        Assert.assertEquals(2, dummy.plusOne(1));
    }
}
