import java.io.*;

public class FileDecryption {

    // Method to decrypt the file
    public static void decryptFile(String inputFile, String outputFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            int character;
            while ((character = reader.read()) != -1) {
                // Subtract 10 from the ASCII value to get the original character
                writer.write(character - 10);
            }
        }
    }

    public static void main(String[] args) {
        String inputFile = "encrypted.txt";
        String outputFile = "decrypted.txt";

        try {
            decryptFile(inputFile, outputFile);
            System.out.println("File decrypted successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
