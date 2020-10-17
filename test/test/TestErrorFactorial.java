package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestErrorFactorial {

    public TestErrorFactorial() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test(expected = ArithmeticException.class)
    public void errorTestFactorialRecursive() {
        assertEquals(-1, testjunit_1.TestJUnit_1.FACTORIAL_RECURSIVE(-5));
    }

    @Test(expected = ArithmeticException.class)
    public void errorTestFactorialIterative() {
        assertEquals(-1, testjunit_1.TestJUnit_1.FACTORIAL_ITERATIVE(-5));
    }
}
