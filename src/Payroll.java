public class Payroll {
    private String employeeName;
    private String employeeID;
    private double hoursWorked;
    private double payRate;

    public Payroll(String employeeName, String employeeID, double hoursWorked, double payRate)
            throws InvalidEmployeeNameException, InvalidEmployeeIDException, InvalidHoursWorkedException, InvalidPayRateException {
        
        if (employeeName.isEmpty()) {
            throw new InvalidEmployeeNameException("Employee name cannot be empty.");
        }

        if (employeeID.isEmpty()) {
            throw new InvalidEmployeeIDException("Employee ID cannot be empty.");
        }

        if (hoursWorked < 0 || hoursWorked > 84) {
            throw new InvalidHoursWorkedException("Hours worked must be between 0 and 84.");
        }

        if (payRate < 0 || payRate > 25) {
            throw new InvalidPayRateException("Pay rate must be between 0 and 25.");
        }

        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public static void main(String[] args) {
        try {
            Payroll payroll = new Payroll("John Doe", "", 40, 30);  // Invalid Employee ID and Pay Rate
        } catch (InvalidEmployeeNameException | InvalidEmployeeIDException | InvalidHoursWorkedException | InvalidPayRateException e) {
            System.out.println(e.getMessage());
        }
    }
}
/*
Payroll Class Exceptions
Task: Write a Payroll class that throws exceptions for various 
error conditions:
An empty string for the employee’s name.
An invalid value for the employee’s ID number.
An invalid number for the hours worked 
(negative or greater than 84).
An invalid number for the hourly pay rate 
(negative or greater than 25).
*/