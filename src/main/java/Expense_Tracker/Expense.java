package Expense_Tracker;

import org.jetbrains.annotations.NotNull;

public class Expense {

    private final String expenseName;
    private final String expenseOccurrence;
    private final double expenseAmount;



    public Expense(String expenseName, String expenseOccurrence, double expenseAmount) {
        this.expenseName = expenseName;
        this.expenseOccurrence = expenseOccurrence;
        this.expenseAmount = expenseAmount;
    }

    @Override
    public @NotNull String toString() {
        return expenseName + ", " + expenseOccurrence + ", " + expenseAmount;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public String getExpenseOccurrence() {
        return expenseOccurrence;
    }

    public double getExpenseAmount() {
        return expenseAmount;
    }
}
