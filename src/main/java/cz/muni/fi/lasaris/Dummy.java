package cz.muni.fi.lasaris;

import java.util.Random;

/**
 * @author <a href="mailto:xstefank122@gmail.com">Martin Stefanko</a>
 */
public class Dummy {

    public String kashyyyk() {
        return "kashyyyk";
    }

    public String tatooine() {
        return "tatooine";
    }

    public String yesOrNo() {
        return (new Random().nextBoolean()) ? "YES" : "NO";
    }

    public boolean alwaysLower(int number) {
        return number <= Integer.MAX_VALUE;
    }
}
