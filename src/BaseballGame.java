import java.util.Scanner;

public class BaseballGame {
    void play(String randomNumber) {
        BaseballValidator baseballValidator = new BaseballValidator();
        String input = "";
        while (!input.equals(randomNumber)) {
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
            baseballValidator.validateInput(input);
            System.out.println("숫자를 입력해 주세요 : " + input);
            baseballValidator.decideBallAndStrike(input, randomNumber);
        }
    }
}