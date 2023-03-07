import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RandomNumberGenerator {
    String createDistinctRandomNumber() {
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9"));
        Collections.shuffle(numbers);
        return String.join("",numbers.subList(0,3));
    }
}
