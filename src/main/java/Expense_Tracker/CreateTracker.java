package Expense_Tracker;



import java.util.ArrayList;

public class CreateTracker {
    public void fillTracker() {

        // Create Array List template
        ArrayList<Expense> ExpenseTracker = new ArrayList<>();

        // Import Expenses from CSV File and Store in List
        ImportExpenses.importExpenseList(ExpenseTracker);

        // Add expenses together
        double dailyExpenses = Analysis.addMonthlyExpenses(ExpenseTracker);


        System.out.println(dailyExpenses);



    }
}
