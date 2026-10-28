
package textanalysis.suffix;

import java.util.Arrays;
import java.util.Comparator;

public final class SimpleSuffixArray {

    private SimpleSuffixArray() {
    }

    public static int[] build(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Text cannot be null");
        }

        int n = text.length();
        Integer[] suffixes = new Integer[n];

        for (int i = 0; i < n; i++) {
            suffixes[i] = i;
        }

        Arrays.sort(suffixes, Comparator.comparing(text::substring));

        int[] suffixArray = new int[n];

        for (int i = 0; i < n; i++) {
            suffixArray[i] = suffixes[i];
        }

        return suffixArray;
    }
}
