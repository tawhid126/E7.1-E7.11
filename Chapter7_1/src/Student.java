import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    private List<Integer> scores;

    public Student(List<Integer> scores) {
        this.scores = new ArrayList<>(scores);
    }

    public void removeMin() {
        if (scores.isEmpty()) return;

        int minIndex = 0;
        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) < scores.get(minIndex)) {
                minIndex = i;
            }
        }

        scores.remove(minIndex);
    }

    public List<Integer> getScores() {
        return scores;
    }

    public static void main(String[] args) {
        List<Integer> initialScores = Arrays.asList(85, 70, 95, 60, 75);

        Student student = new Student(initialScores);

        System.out.println("Initial scores: " + student.getScores());

        student.removeMin();

        System.out.println("Scores after removing the minimum: " + student.getScores());
    }
}
