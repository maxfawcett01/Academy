package Dates;

import java.time.LocalDate;
import java.time.Period;

public class LocalDateDemo {

    public void  demo() {

        LocalDate today = LocalDate.now();
        LocalDate yesterday = LocalDate.parse("2023-09-08");

        LocalDate birthday = LocalDate.of(2000, 07, 29);

        Period age = Period.between(birthday, today);

        System.out.println("I'm exactly " + age.getYears() + " Years " + age.getMonths() + " Months " + age.getDays() + " Days Old!");
    }
}
