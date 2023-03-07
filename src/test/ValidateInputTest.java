package test;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ValidateInputTest {
    @Test
    @DisplayName("Input 값 유효성 검증 테스트")
    void validateInput() {
        String input = "012";
        String regex = "^[1-9]{3}$";
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            if(!input.matches(regex)) {
                throw new IllegalArgumentException("입력값은 세자리 수의 1~9 사이의 숫자로만 구성되어야 합니다.");
            }
        });
        assertEquals("입력값은 세자리 수의 1~9 사이의 숫자로만 구성되어야 합니다.", exception.getMessage());
    }

    @Test
    @DisplayName("스트라이크 & 볼 카운트 로직 검증 테스트")
    void decideBallAndStrike() {
        int ball = 0;
        int strike = 0;

        String input = "123";
        String number = "215";

        for (int i = 0; i < 3; i++) {
            if (input.charAt(i) == number.charAt(i)) {
                strike++;
            }
            else if(number.contains(String.valueOf(input.charAt(i)))) {
                ball++;
            }
        }
        Assertions.assertThat(strike).isEqualTo(0);
        Assertions.assertThat(ball).isEqualTo(2);
    }

    @Test
    @DisplayName("스트라이크 & 볼 출력 테스트")
    void printResult() {
        ArrayList<Integer> balls = new ArrayList<>(Arrays.asList(0,1,2,3));
        ArrayList<Integer> strikes = new ArrayList<>(Arrays.asList(0,1,2,3));

        String res = result(balls.get(0), strikes.get(0));
        String res1 = result(balls.get(0), strikes.get(1));
        String res2 = result(balls.get(2), strikes.get(1));

        Assertions.assertThat(res).isEqualTo("낫싱");
        Assertions.assertThat(res1).isEqualTo("1스트라이크");
        Assertions.assertThat(res2).isEqualTo("2볼 1스트라이크");
    }

    String result(int ball, int strike) throws IllegalArgumentException {
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
