import java.io.Serializable;

public class TestScores implements Serializable {
    private double score;

    public TestScores(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }
}
