package StudentBillingSystem;

public class Undergraduate extends Student {
    @Override
    protected double calculateTotalHours() {
        return 0;
    }

    @Override
    protected double calculateRate() {
        return 0;
    }

    @Override
    protected double calculateDiscount() {
        return 0;
    }

    @Override
    protected double calculateTenureDiscount() {
        return 0;
    }
}
