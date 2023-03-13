package test;

import baseball.Ball;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ValidationInputTest {
    @Test
    @DisplayName("Ball 클래스 내부에서 야구_숫자_1_9_검증")
    void validBallNumber() {
        assertThatThrownBy(() -> new Ball(1, 10))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("입력값은 1~9까지의 숫자입니다.");
    }
}
