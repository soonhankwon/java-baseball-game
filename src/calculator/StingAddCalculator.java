package calculator;

import java.util.Scanner;

public class StingAddCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputValidator validator = new InputValidator();
        System.out.println(validator.validateInput(scanner.nextLine()));
    }
}
