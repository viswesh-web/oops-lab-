class Customer {
    private String name;
    private int meterNumber;
    private double previousReading;
    private double currentReading;

    public Customer(String name, int meterNumber) {
        this.name = name;
        this.meterNumber = meterNumber;
    }

    public void setReadings(double previous, double current) {
        this.previousReading = previous;
        this.currentReading = current;
    }

    public double calculateBill(double ratePerUnit) {
        double units = currentReading - previousReading;
        return units * ratePerUnit;
    }
}
