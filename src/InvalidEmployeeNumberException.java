// Custom exception for invalid employee number
class InvalidEmployeeNumberException extends Exception {
    public InvalidEmployeeNumberException(String message) {
        super(message);
    }
}