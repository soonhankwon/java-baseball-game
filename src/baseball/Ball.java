package baseball;

public class Ball {
    public static final int MIN_NO = 1;
    public static final int MAX_NO = 9;
    private final int position;
    private final int ballNo;

    public Ball(int position, int ballNo) {
        if(!isBallValid(ballNo)) {
            throw new IllegalArgumentException("입력값은 1~9까지의 숫자입니다.");
        }
        this.position = position;
        this.ballNo = ballNo;
    }

    private boolean isBallValid(int ballNo) {
        return ballNo >= MIN_NO && ballNo <= MAX_NO;
    }

    public BallStatus play(Ball ball) {
        if(this.equals(ball)) {
            return BallStatus.STRIKE;
        }
        if(ball.matchBallNo(ballNo)) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }
    private boolean matchBallNo(int ballNo) {
        return this.ballNo == ballNo;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o==null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return position == ball.position && ballNo == ball.ballNo;
    }
}
