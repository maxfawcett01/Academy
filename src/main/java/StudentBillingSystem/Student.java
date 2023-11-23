package StudentBillingSystem;

public abstract class Student {
    public final double getCurrentFee() {
        double totalHours = calculateTotalHours();
        double rate = calculateRate();
        double discount = calculateDiscount();
        double tenureDiscount = calculateTenureDiscount();

        double fee = totalHours * rate;
        fee -= discount;
        fee -= tenureDiscount;

        return fee;
    }

    protected abstract double calculateTotalHours();
    protected abstract double calculateRate();
    protected abstract double calculateDiscount();
    protected abstract double calculateTenureDiscount();
}
