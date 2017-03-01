package cz.muni.fi.lasaris;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] testArray = new Random().ints(0, 100).limit(10).toArray();

        System.out.println("Test list: " + Arrays.toString(testArray));
        System.out.println("-------------------------");
        System.out.println("maximum: " + new DummyComputeMax().computeMax(testArray));
    }
}
