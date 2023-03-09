package baseball;

import java.util.Scanner;

public class BaseballApp {
    public static void main(String[] args) {
        BaseballGame baseballGame = new BaseballGame();
        baseballGame.play();

        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

        Scanner scanner = new Scanner(System.in);
        String startOrEnd = scanner.nextLine();

        isGameRestart(args, scanner, startOrEnd);
    }

    private static void isGameRestart(String[] args, Scanner scanner, String startOrEnd) {
        if (startOrEnd.equals("1"))
            main(args);
        if (startOrEnd.equals("2"))
            scanner.close();
    }
}
