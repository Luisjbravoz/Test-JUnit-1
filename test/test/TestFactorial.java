package test;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class TestFactorial {

    private long expected;
    private int parameter;

    @Parameters
    public static Iterable<Object[]> INIT() {
        return Arrays.asList(new Object[][]{
            {120L, 5}, {3628800L, 10}, {6227020800L, 13},
            {40320L, 8}, {2432902008176640000L, 20}, {20922789888000L, 16},
            {6402373705728000L, 18}, {355687428096000L, 17}, {39916800L, 11},
            {6L, 3}, {1L, 0}, {1L, 1}
        });
    }

    public TestFactorial(long expected, int parameter) {
        this.expected = expected;
        this.parameter = parameter;
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

    @Test
    public void testFactorialRecursive() {
        assertEquals(expected, testjunit_1.TestJUnit_1.FACTORIAL_RECURSIVE(parameter));
    }

    @Test
    public void testFactorialIterative() {
        assertEquals(expected, testjunit_1.TestJUnit_1.FACTORIAL_ITERATIVE(parameter));
    }

}
