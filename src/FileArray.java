import java.io.*;

public class FileArray {
    
    // Method to write an int array to a binary file
    public static void writeArray(String fileName, int[] array) throws IOException {
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream(fileName))) {
            for (int number : array) {
                output.writeInt(number);
            }
        }
    }

    // Method to read an int array from a binary file
    public static void readArray(String fileName, int[] array) throws IOException {
        try (DataInputStream input = new DataInputStream(new FileInputStream(fileName))) {
            for (int i = 0; i < array.length; i++) {
                array[i] = input.readInt();
            }
        }
    }

    public static void main(String[] args) {
        int[] writeData = {10, 20, 30, 40, 50};
        int[] readData = new int[5];

        try {
            // Write the array to a file
            writeArray("numbers.dat", writeData);

            // Read the array from the file
            readArray("numbers.dat", readData);

            // Display the read data
            for (int number : readData) {
                System.out.print(number + " ");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/*
FileArray Class
You need to design a class that has two methods:

writeArray: Writes an integer array to a binary file.
readArray: Reads an integer array from a binary file.
*/