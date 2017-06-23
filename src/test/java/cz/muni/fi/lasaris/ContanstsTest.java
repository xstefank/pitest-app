package cz.muni.fi.lasaris;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author <a href="mailto:xstefank122@gmail.com">Martin Stefanko</a>
 */
public class ContanstsTest {

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
    public void alwaysLowerTest() {
        Assert.assertTrue(dummy.alwaysLower(Integer.MAX_VALUE));
    }
}
