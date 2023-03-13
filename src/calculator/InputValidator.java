package calculator;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidator {
    public int validateInput(String text) {
        if (isBlank(text)) {
            return 0;
        }
        return sum(split(text));
    }

    private boolean isBlank(String text) {
        return text == null || text.isEmpty();
    }

    private String[] split(String text) {
        if(text.contains("-")) {
            throw new RuntimeException();
        }
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (m.find()) {
            return m.group(2).split(m.group(1));
        }
        return text.split(",|:");
    }

    private int sum(String[] text) {
        return Arrays.stream(text)
                .mapToInt(Integer::parseInt)
                .sum();
    }
}