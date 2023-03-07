package test;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RandomNumberGeneratorTest {
    @Test
    @DisplayName("1 ~ 9 범위의 중복되지 않은 랜덤 숫자 리스트 생성 테스트")
    void createRandomNumberDedupe() {
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9"));
        shuffle(numbers);
        System.out.println(numbers);
    }

    @Test
    @DisplayName("리스트에서 3개의 숫자만 남기고 제거 테스트")
    void createThreeNumber() {
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9"));
        shuffle(numbers);
        numbers.subList(3, numbers.size()).clear();
        Assertions.assertThat(numbers.size()).isEqualTo(3);
    }

    void shuffle(ArrayList<String> arr) {
        Collections.shuffle(arr);
    }
}
