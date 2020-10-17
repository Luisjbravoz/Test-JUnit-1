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
public class TestFibonacci {

    private long expected;
    private int parameter;

    @Parameters
    public static Iterable<Object[]> INIT() {
        return Arrays.asList(new Object[][]{
            {1L, 2}, {160500643816367088L, 84}, {7778742049L, 49},
            {117669030460994L, 69}, {165580141L, 41}, {14472334024676221L, 79},
            {8944394323791464L, 78}, {6765L, 20}, {679891637638612258L, 87},
            {23416728348467685L, 80}, {5527939700884757L, 77}, {20365011074L, 51},
            {-1836311903L, -46}, {1134903170L, -45}, {-8944394323791464L, -78},
            {-10610209857723L, -64}, {-1548008755920L, -60}, {28657L, -23},});
    }

    public TestFibonacci(long expected, int parameter) {
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
    public void testFibonacciRecursive() {
        assertEquals(expected, testjunit_1.TestJUnit_1.FIBONACCI_RECURSIVE(parameter));
    }

    @Test
    public void testFibonacciIterative() {
        assertEquals(expected, testjunit_1.TestJUnit_1.FIBONACCI_ITERATIVE(parameter));
    }

}
