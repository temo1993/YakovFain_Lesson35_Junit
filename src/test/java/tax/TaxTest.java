package test.java.tax;

import main.java.tax.Tax;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaxTest {
    private static Tax tax;
    @BeforeClass
    public static void setUp(){
        tax = new Tax();
        System.out.println("In setUp");
    }
    @Test
    public void testZeroTax() {
        assertEquals("Tax on zero income is not zero", 0,
                tax.calcTax(0, 0),0 );
    }
    @Test
    public void testOneStudentTaxDeductionIs300(){
        assertEquals("The $300 student discount was not applied",
                2000, tax.applyStudentDeduction(2300, 1), 0);
    }
    @AfterClass
    public static void tearDown(){
        System.out.println("In tearDown");
    }
}
