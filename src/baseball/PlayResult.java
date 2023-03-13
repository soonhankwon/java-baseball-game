package baseball;

public class PlayResult {
    private int strike = 0;
    private int ball = 0;

    public int getStrike() {
        return this.strike;
    }

    public int getBall() {
        return this.ball;
    }

    public void report(BallStatus status) {
        if (status.isStrike()) {
            this.strike += 1;
        }
        if (status.isBall()) {
            this.ball += 1;
        }
    }

    public void printResult() {
        if (this.getStrike() == 0 && this.getBall() == 0)
            System.out.println("낫싱");
        if (this.getStrike() > 0 || this.getBall() > 0)
            System.out.println(this.getStrike() + " 스트라이크 " + this.getBall() + "볼");
    }

    public boolean isGameEnd() {
        return this.strike == 3;
    }
}
