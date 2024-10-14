# Exceptions and Advanced File I/O in Java

This project demonstrates the use of **custom exceptions** and **advanced file input/output (I/O)** operations in Java. The project includes several exercises focusing on handling exceptions and performing operations such as file reading/writing, encryption, decryption, and serialization.

## Project Overview

This project contains the following key features:

### Custom Exceptions:
- **NegativePriceException**: Thrown when an invalid negative price is provided for an item.
- **NegativeUnitsException**: Thrown when the number of units for an item is negative.
- **InvalidEmployeeNumberException**, **InvalidShiftException**, **InvalidPayRateException**: Used in the `Payroll` class to handle invalid data for employees.

### File I/O Operations:
- **File Encryption and Decryption**: 
    - **FileEncryption.java**: Encrypts a text file by modifying the ASCII values of characters.
    - **FileDecryption.java**: Decrypts the previously encrypted file, restoring the original text.

- **Serialization**:
    - **TestScoresSerialization.java**: Demonstrates how to serialize and deserialize objects to and from a file.

- **Reading and Writing Files**:
    - **RetailItem.java**: Demonstrates file input and output by writing and reading data related to retail items.
  
### Files in the Project:

1. **Java Files**:
    - `RetailItem.java`
    - `NegativePriceException.java`
    - `NegativeUnitsException.java`
    - `FileEncryption.java`
    - `FileDecryption.java`
    - `TestScoresSerialization.java`
    - `Payroll.java` (with custom exceptions)
  
2. **Sample Data Files**:
    - `plaintext.txt`: Input file used for encryption.
    - `encrypted.txt`: Output file created after encryption.
    - `numbers.dat`: Binary file for storing serialized objects.
    - `SalesData.txt`: Example data file for the `RetailItem` class.

## How to Run the Project:

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/ExceptionsAdvancedFileIO.git
    ```

2. Navigate to the project directory:
    ```bash
    cd ExceptionsAdvancedFileIO
    ```

3. Compile and run the individual Java programs:
    ```bash
    javac src/*.java
    java -cp src FileEncryption   # Example to run the FileEncryption class
    ```

## Example Usage:

### File Encryption:
1. Add text to `plaintext.txt`.
2. Run `FileEncryption.java` to create the encrypted file.
3. Run `FileDecryption.java` to decrypt and restore the original text.

### Serialization:
1. Run `TestScoresSerialization.java` to serialize test score objects to `numbers.dat`.
2. Deserialize the objects to view their data.

## Author
**Your Name** - [GitHub](https://github.com/yourusername)
