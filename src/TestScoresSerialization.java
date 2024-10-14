import java.io.*;

public class TestScoresSerialization {

    // Method to serialize an array of TestScore objects
    public static void serializeTestScores(String fileName, TestScores[] scores) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(scores);
        }
    }

    // Method to deserialize an array of TestScore objects
    public static TestScores[] deserializeTestScores(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            return (TestScores[]) in.readObject();
        }
    }

    public static void main(String[] args) {
        // Create an array of TestScores
        TestScores[] scores = {
            new TestScores(85),
            new TestScores(90),
            new TestScores(78),
            new TestScores(88),
            new TestScores(92)
        };

        String fileName = "testscores.ser";

        try {
            // Serialize the TestScores array
            serializeTestScores(fileName, scores);
            System.out.println("TestScores serialized successfully.");

            // Deserialize the TestScores array
            TestScores[] deserializedScores = deserializeTestScores(fileName);
            System.out.println("TestScores deserialized successfully.");

            // Display the deserialized scores
            for (TestScores score : deserializedScores) {
                System.out.println("Score: " + score.getScore());
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
