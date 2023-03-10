package calculator;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidator {
    public static final String customExpression = "//(.)\n(.*)";
    public int validateInput(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        if(text.contains("-")) {
            throw new RuntimeException();
        }
        if (text.length() == 1) {
            return Integer.parseInt(text);
        }
        if (isContainExpression(text)) {
            return Arrays.stream(text.split(customExpression))
                    .mapToInt(Integer::parseInt)
                    .sum();
        }
        if(isCustomExpression(text)) {
            Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
            if (m.find()) {
                String customDelimiter = m.group(1);
                String[] tokens= m.group(2).split(customDelimiter);
                return Arrays.stream(tokens)
                        .mapToInt(Integer::parseInt)
                        .sum();
            }
        }
        return 0;
    }

    private boolean isCustomExpression(String text) {
        return text.matches(customExpression);
    }

    private boolean isContainExpression(String text) {
        return (text.contains(",") || text.contains(":"));
    }
}


