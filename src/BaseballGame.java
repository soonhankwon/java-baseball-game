import java.util.Scanner;

public class BaseballGame {
    String computerNumber;
    String userNumber;

    void start() {
        play();
    }

    void createComputerNumber() {
        int min = 1;
        int max = 9;
        String number1 = String.valueOf((int)(Math.random() * (max - min +1)) + min);
        String number2 = String.valueOf((int)(Math.random() * (max - min +1)) + min);
        String number3 = String.valueOf((int)(Math.random() * (max - min +1)) + min);
        setComputerNumber(number1+number2+number3);
    }

    void play() {
        createComputerNumber();
        String numbers = input();
        BaseballValidator baseballValidator = new BaseballValidator();
    }

    String input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    void end() {

    }

    public void setComputerNumber(String computerNumber) {
        this.computerNumber = computerNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }
}
