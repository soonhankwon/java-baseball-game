package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BaseballGameTest {
    @Test
    @DisplayName("컴퓨터 랜덤 숫자 생성 테스트")
    void createRandomNumber() {
        for(int i = 0; i < 3; i++) {
            String ret = createComputerNumber();
            System.out.println(ret);
        }
    }


    String createComputerNumber() {
        int min = 1;
        int max = 9;
        String number1 = String.valueOf((int)(Math.random() * (max - min +1)) + min);
        String number2 = String.valueOf((int)(Math.random() * (max - min +1)) + min);
        String number3 = String.valueOf((int)(Math.random() * (max - min +1)) + min);
        return number1+number2+number3;
    }
}


