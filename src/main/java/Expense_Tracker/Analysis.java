package Expense_Tracker;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Analysis {
    public static double addMonthlyExpenses(@NotNull ArrayList<Expense> expenseTracker) {

            double total = 0;
            for (Expense expense : expenseTracker) {
                if (expense.getExpenseOccurrence().equalsIgnoreCase("Monthly")) {
                    total += expense.getExpenseAmount();
                }
            }
            return total;
    }
}
