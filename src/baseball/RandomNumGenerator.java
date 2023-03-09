package baseball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RandomNumGenerator {
    public static ArrayList<Integer> generateRandomNumber() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Collections.shuffle(numbers);
        return new ArrayList<>(numbers.subList(0,3));
    }
}
