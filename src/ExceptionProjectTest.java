// Test class
public class ExceptionProjectTest {
    public static void main(String[] args) {
        try {
            // Invalid employee number
            ProductionWorker worker1 = new ProductionWorker("John Doe", "123-X", 1, 20.0);
        } catch (InvalidEmployeeNumberException | InvalidShiftException | InvalidPayRateException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Invalid shift
            ProductionWorker worker2 = new ProductionWorker("Jane Doe", "123-A", 3, 20.0);
        } catch (InvalidEmployeeNumberException | InvalidShiftException | InvalidPayRateException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Negative pay rate
            ProductionWorker worker3 = new ProductionWorker("Jim Doe", "123-A", 1, -5.0);
        } catch (InvalidEmployeeNumberException | InvalidShiftException | InvalidPayRateException e) {
            System.out.println(e.getMessage());
        }
    }
}