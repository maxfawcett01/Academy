package Expense_Tracker;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.jetbrains.annotations.NotNull;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ImportExpenses {
    static void importExpenseList(@NotNull ArrayList<Expense> expenseTracker) {
        try (CSVReader fileScanner = new CSVReader(new FileReader("src/main/resources/Expenses.csv"))) {
            List<String[]> csvData = fileScanner.readAll();

            for (String[] row : csvData) {
                if (row.length >= 3) {
                    String expenseName = row[0];
                    String expenseOccurrence = row[1].replaceAll(" ","");
                    String expenseAmount = row[2].replaceAll("£", ""); // Remove the £ symbol
                    double thirdDouble = Double.parseDouble(expenseAmount);


                    expenseTracker.add(new Expense(expenseName, expenseOccurrence, thirdDouble));
                }


            }
        } catch (IOException | CsvException e) {
            throw new RuntimeException(e);
        }
    }
}
