
public class RetailItem {
    private String description;
    private double price;
    private int units;

    public RetailItem(String description, double price, int units) throws NegativePriceException, NegativeUnitsException {
        if (price < 0) {
            throw new NegativePriceException("Price cannot be negative: " + price);
        }
        if (units < 0) {
            throw new NegativeUnitsException("Units cannot be negative: " + units);
        }
        this.description = description;
        this.price = price;
        this.units = units;
    }

    public static void main(String[] args) {
        try {
            RetailItem item = new RetailItem("Shirt", -49.99, 10);
        } catch (NegativePriceException | NegativeUnitsException e) {
            System.out.println(e.getMessage());
        }

        try {
            RetailItem item2 = new RetailItem("Pants", 49.99, -5);
        } catch (NegativePriceException | NegativeUnitsException e) {
            System.out.println(e.getMessage());
        }
    }
}
