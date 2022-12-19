package udemy.numbers;

import java.util.Arrays;

public class BiggerAndSmaller {

    private int bigger, smaller;

    public void find(int[] numbers) throws Exception {
        bigger = Arrays.stream(numbers).max().orElseThrow(() -> new Exception("Not found"));
        smaller = Arrays.stream(numbers).min().orElseThrow(() -> new Exception("Not found"));
    }

    public int getBigger() {
        return bigger;
    }

    public int getSmaller() {
        return smaller;
    }
}
