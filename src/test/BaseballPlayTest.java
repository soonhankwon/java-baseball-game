package test;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class BaseballPlayTest {

    @Test
    @DisplayName("플레이 로직 검증 테스트")
    void testPlay() {
        //given
        String randomNumber = "123";
        String[] inputValues = {"124", "147", "321", "456", "123", "769"};
        ArrayList<String> messages = new ArrayList<>();
        for (String inputValue : inputValues) {
            System.out.println("숫자를 입력해 주세요 : " + inputValue);
            String message = decideBallAndStrike(inputValue, randomNumber);
            messages.add(message);
            if (inputValue.equals(randomNumber))
                break;
        }
        Assertions.assertThat(messages.get(0)).isEqualTo("2스트라이크");
        Assertions.assertThat(messages.get(1)).isEqualTo("1스트라이크");
        Assertions.assertThat(messages.get(2)).isEqualTo("2볼 1스트라이크");
    }
    private String decideBallAndStrike(String input, String number) {
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
        return result(ball, strike);
    }

    private void printResult(int ball, int strike) {
        System.out.println(result(ball, strike));
    }

    private String resultReciever(int ball, int strike) {
        return ball + "볼 " + strike + "스트라이크";
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
