package calculator;

import java.util.Arrays;

public class InputValidator {
    public int validateInput(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        if (text.length() == 1) {
            return Integer.parseInt(text);
        }
        if(text.contains(",") && text.length() > 2) {
            return Arrays.stream(text.split(","))
                    .mapToInt(Integer::parseInt)
                    .sum();
        }
        return 0;
    }
}
