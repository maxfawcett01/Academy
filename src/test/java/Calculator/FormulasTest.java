package Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormulasTest {

    Formulas formulas = new Formulas();

    double expected;
    double actual;

    @Test
    public void adding() {
        expected = 5;
        actual = Formulas.adding(3,2);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void subtracting() {
        expected = 1;
        actual = Formulas.subtracting(3,2);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void multiplying() {
        expected = 6;
        actual = Formulas.multiplying(3,2);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void dividing() {
        expected = 3;
        actual = Formulas.dividing(6,2);
        Assertions.assertEquals(expected,actual);
    }
}