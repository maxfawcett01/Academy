package Collections.Activity2;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.Objects;

public final class MovieStar {
    private final String firstName;
    private final String lastName;
    private final String mostFamousRole;
    private final LocalDate birthdate;

    public MovieStar(String firstName, String lastName, String mostFamousRole, LocalDate birthdate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mostFamousRole = mostFamousRole;
        this.birthdate = birthdate;
    }

    @Override
    public @NotNull String toString() {
        return firstName + " " + lastName + ", " + mostFamousRole + ", " + birthdate.getYear() + " " + birthdate.getMonth() + " " + birthdate.getDayOfMonth();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (MovieStar) obj;
        return Objects.equals(this.firstName, that.firstName) &&
                Objects.equals(this.lastName, that.lastName) &&
                Objects.equals(this.mostFamousRole, that.mostFamousRole) &&
                this.birthdate == that.birthdate;
    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    public String mostFamousRole() {
        return mostFamousRole;
    }

    public LocalDate birthdate() {
        return birthdate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, mostFamousRole, birthdate);
    }

}
