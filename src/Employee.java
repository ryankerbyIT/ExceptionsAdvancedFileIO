// Employee class
class Employee {
    private String name;
    private String employeeNumber;

    public Employee(String name, String employeeNumber) throws InvalidEmployeeNumberException {
        this.name = name;
        setEmployeeNumber(employeeNumber);
    }

    public void setEmployeeNumber(String employeeNumber) throws InvalidEmployeeNumberException {
        if (!employeeNumber.matches("\\d{3}-[A-M]")) {
            throw new InvalidEmployeeNumberException("Invalid employee number: " + employeeNumber);
        }
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getName() {
        return name;
    }
}

// ProductionWorker class
class ProductionWorker extends Employee {
    private int shift;
    private double hourlyPayRate;

    public ProductionWorker(String name, String employeeNumber, int shift, double hourlyPayRate)
            throws InvalidEmployeeNumberException, InvalidShiftException, InvalidPayRateException {
        super(name, employeeNumber);
        setShift(shift);
        setHourlyPayRate(hourlyPayRate);
    }

    public void setShift(int shift) throws InvalidShiftException {
        if (shift != 1 && shift != 2) {
            throw new InvalidShiftException("Invalid shift. Shift must be 1 (Day) or 2 (Night).");
        }
        this.shift = shift;
    }

    public void setHourlyPayRate(double hourlyPayRate) throws InvalidPayRateException {
        if (hourlyPayRate < 0) {
            throw new InvalidPayRateException("Hourly pay rate cannot be negative.");
        }
        this.hourlyPayRate = hourlyPayRate;
    }

    public int getShift() {
        return shift;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }
}

/*
Key Points:
InvalidEmployeeNumberException: This is thrown if the employee 
number doesn't follow the pattern XXX-X where X is a digit and 
the last letter must be between 'A' and 'M'.
InvalidShiftException: This is thrown if the shift is not 1 (Day)
 or 2 (Night).
InvalidPayRateException: This is thrown if the pay rate is 
negative.
*/