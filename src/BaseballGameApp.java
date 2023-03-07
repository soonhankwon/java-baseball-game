import java.util.Scanner;

public class BaseballGameApp {
    public static void main(String[] args) {
        String input = "";
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        String randomNumber = randomNumberGenerator.createDistinctRandomNumber();
        BaseballGame baseballGame = new BaseballGame();
        baseballGame.play(input, randomNumber);

        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

        Scanner scanner = new Scanner(System.in);
        String startOrEnd = scanner.nextLine();

        if (startOrEnd.equals("1")) {
            main(args);
        }
        else if (startOrEnd.equals("2")) {
            scanner.close();
        }
    }
}
