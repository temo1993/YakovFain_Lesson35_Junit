package test.java.tax;

import main.java.tax.Tax;
import org.junit.Test;

import static org.junit.Assert.fail;

public class TaxExceptionTest {
    @Test(expected=IllegalArgumentException.class)
    public void testForNegativeGrossIncome() {
        Tax tax = new Tax();
        tax.calcTax(-100, 2);
        fail("grossIncome in calcTax() can't be negative.");
    }
}
