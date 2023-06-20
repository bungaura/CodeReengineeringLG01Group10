
public class USDConverter {
	private String currencyTo;

    public USDConverter(String currencyTo) {
        this.currencyTo = currencyTo;
    }

    public double convert(double price) {
        if (currencyTo.equalsIgnoreCase("EUR")) {
            return price * 0.9;
        } else if (currencyTo.equalsIgnoreCase("IDR")) {
            return price * 15000;
        } else {
            throw new IllegalArgumentException("Unrecognized currency: " + currencyTo);
        }
    }
}
