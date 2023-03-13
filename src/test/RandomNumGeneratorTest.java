package test;

import baseball.RandomNumGenerator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class RandomNumGeneratorTest {
    @Test
    @DisplayName("컴퓨터 랜덤 넘버 3개 생성 테스트")
    void generateRandomNumber() {
        ArrayList<Integer> numbers = RandomNumGenerator.generateRandomNumber();
        System.out.println(numbers);
        Assertions.assertThat(numbers.size()).isEqualTo(3);
    }
}
