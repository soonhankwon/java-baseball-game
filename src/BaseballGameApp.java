import java.util.ArrayList;
import java.util.Scanner;

public class BaseballGameApp {
    public static void main(String[] args) {
        String input = "";
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        String randomNumber = String.join("",randomNumberGenerator
                .createDistinctRandomNumber()
                .subList(0,3));

        while (!input.equals(randomNumber)) {
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
            System.out.println("숫자를 입력해 주세요 : " + input);

            validateInput(input, randomNumber);
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

        Scanner scanner = new Scanner(System.in);
        String startOrEnd = scanner.nextLine();
        if(startOrEnd.equals("1")) {
            main(args);
        } else {
            scanner.close();
        }
    }

    private static void validateInput(String input, String number) {
        ArrayList<Character> arr = new ArrayList<>();
        for(int i = 0; i < number.length(); i++) {
            arr.add(number.charAt(i));
        }

        int ball = 0;
        int strike = 0;

        for (int i = 0; i < 3; i++) {
            if (input.charAt(i) == number.charAt(i)) {
                strike++;
                continue;
            }
            if(arr.contains(input.charAt(i))) {
                ball++;
            }
        }

        if (ball == 0 && strike == 0) {
            System.out.println("낫싱");
        } else if (ball > 0 && strike > 0) {
            System.out.println(ball + "볼 " + strike + "스트라이크");
        } else if (strike == 0) {
            System.out.println(ball + "볼");
        } else {
            System.out.println(strike + "스트라이크");
        }
    }
}
