package cz.muni.fi.lasaris.max;

public class SillyComputeMax {

    public int computeMax(int[] arr) {
        int max = 0;
        int i = 0;

        while (i < arr.length) {
            if (arr[i] > max) {
                max = arr[i];
            }

            i = i + 1;
        }

        return max;
    }
}
