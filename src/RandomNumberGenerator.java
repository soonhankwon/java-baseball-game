import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RandomNumberGenerator {
    ArrayList<String> createDistinctRandomNumber() {
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9"));
        shuffle(numbers);
        numbers.subList(3, numbers.size()).clear();
        return numbers;
    }

    void shuffle(ArrayList<String> arr) {
        Collections.shuffle(arr);
    }
}
