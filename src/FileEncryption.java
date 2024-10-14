import java.io.*;

public class FileEncryption {

    // Method to encrypt the file
    public static void encryptFile(String inputFile, String outputFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            int character;
            while ((character = reader.read()) != -1) {
                // Add 10 to the ASCII value of each character
                writer.write(character + 10);
            }
        }
    }

    public static void main(String[] args) {
        String inputFile = "plaintext.txt";
        String outputFile = "encrypted.txt";

        try {
            encryptFile(inputFile, outputFile);
            System.out.println("File encrypted successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
/*
Explanation:
FileArray Class: The writeArray method writes an array of 
integers to a binary file, and the readArray method reads 
integers back into an array.
FileEncryption Filter: This simple file encryption filter 
reads characters from an input file, adds 10 to their ASCII 
values, and writes the encoded characters to a new file.
*/