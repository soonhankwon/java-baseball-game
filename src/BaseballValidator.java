public class BaseballValidator {
    void validateInput(String input) {
        String regex = "^[1-9]{3}$";
        if(!input.matches(regex)) {
            throw new IllegalArgumentException("입력값은 세자리 수의 1~9 사이의 숫자로만 구성되어야 합니다.");
        }
    }
    void decideBallAndStrike(String input, String number) {
        int ball = 0;
        int strike = 0;

        for (int i = 0; i < 3; i++) {
            if (input.charAt(i) == number.charAt(i)) {
                strike++;
            }
            else if(number.contains(String.valueOf(input.charAt(i)))) {
                ball++;
            }
        }
        printResult(ball, strike);
    }
    private void printResult(int ball, int strike) {
        System.out.println(result(ball, strike));
    }

    private String result(int ball, int strike) throws IllegalArgumentException {
        if (ball == 0 && strike == 0) {
            return "낫싱";
        } else if (ball > 0 && strike > 0) {
            return ball + "볼 " + strike + "스트라이크";
        } else if (strike == 0) {
            return ball + "볼";
        } else if (ball == 0){
            return strike + "스트라이크";
        }
        throw new IllegalArgumentException("잘못된 입력값 입니다.");
    }
}
