package baseball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BaseballGame {
    void play() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> randomNumber = RandomNumGenerator.generateRandomNumber();
        int comNumber = randomNumberConvertToInteger(randomNumber);
        System.out.println(comNumber);

        Balls comBalls = new Balls(randomNumber);
        PlayResult result = new PlayResult();
        while (!result.isGameEnd()) {
            ArrayList<Integer> userBalls = getUserInput(scanner);
            System.out.println("숫자를 입력해 주세요 : " + userBalls.get(0) + userBalls.get(1) + userBalls.get(2));

            result = comBalls.play(userBalls);
            result.printResult();
        }
    }
    private int randomNumberConvertToInteger(ArrayList<Integer> randomNumber) {
        return randomNumber.get(0) * 100 + randomNumber.get(1) * 10 + randomNumber.get(2);
    }

    private ArrayList<Integer> getUserInput(Scanner scanner) {
        String input = scanner.nextLine();
        return Arrays.stream(input.split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
