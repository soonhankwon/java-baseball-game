package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private final List<Ball> answers;

    public Balls(List<Integer> answers) {
        this.answers = mapBalls(answers);
    }

    private static List<Ball> mapBalls(List<Integer> answers) {
        List<Ball> balls = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            balls.add(i, new Ball(i + 1, answers.get(i)));
        }
        return balls;
    }

    public PlayResult play(List<Integer> balls) {
        Balls userBalls = new Balls(balls);
        PlayResult result = new PlayResult();
        for(Ball answer : answers) {
            BallStatus status = userBalls.play(answer);
            result.report(status);
        }
        return result;
    }

        public BallStatus play(Ball userball) {
        return answers.stream()
                .map(answer -> answer.play(userball))
                .filter(BallStatus::isNotNothing)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }
}
