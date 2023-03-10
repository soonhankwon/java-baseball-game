package test.calculatorTest;

import calculator.InputValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidateInputTest {
    InputValidator validator;
    @BeforeEach
    void setup() {
        validator = new InputValidator();
    }
    @Test
    @DisplayName("빈 문자열 또는 null 값을 입력할 경우 0 반환 테스트")
    void ifInputNullOrEmptyStringReturnZero() {
        int ret1 = validator.validateInput(null);
        int ret2 = validator.validateInput("");
        assertThat(ret1).isEqualTo(0);
        assertThat(ret2).isEqualTo(0);
    }

    @Test
    @DisplayName("숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환 테스트")
    void ifInputOneNumber() {
        int ret1 = validator.validateInput("1");
        assertThat(ret1).isEqualTo(1);
    }

    @Test
    @DisplayName("숫자 두개를 컴마(,) 구분자로 입력할 경우 두 숫자의 합을 반환 테스트")
    void ifInputTwoNumbersAndComma() {
        int ret1 = validator.validateInput("1,2");
        assertThat(ret1).isEqualTo(3);
    }
}
