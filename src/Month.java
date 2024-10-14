public class Month {
    private int monthNumber;
    private String monthName;
    private static final String[] monthNames = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    public Month(int monthNumber) throws InvalidMonthNumberException {
        if (monthNumber < 1 || monthNumber > 12) {
            throw new InvalidMonthNumberException("Invalid month number: " + monthNumber);
        }
        this.monthNumber = monthNumber;
        this.monthName = monthNames[monthNumber - 1];
    }

    public Month(String monthName) throws InvalidMonthNameException {
        boolean valid = false;
        for (String name : monthNames) {
            if (name.equalsIgnoreCase(monthName)) {
                valid = true;
                this.monthName = name;
                this.monthNumber = java.util.Arrays.asList(monthNames).indexOf(name) + 1;
                break;
            }
        }
        if (!valid) {
            throw new InvalidMonthNameException("Invalid month name: " + monthName);
        }
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public String getMonthName() {
        return monthName;
    }

    public static void main(String[] args) {
        try {
            Month m1 = new Month(13);  // Will throw an InvalidMonthNumberException
        } catch (InvalidMonthNumberException e) {
            System.out.println(e.getMessage());
        }

        try {
            Month m2 = new Month("Decemb");  // Will throw an InvalidMonthNameException
        } catch (InvalidMonthNameException e) {
            System.out.println(e.getMessage());
        }
    }
}