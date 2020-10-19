package test;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class TestPower {
    
    private double expected, parameterB;
    private int parameterN;
    
    @Parameterized.Parameters
    public static Iterable<Object[]> INIT() {
        return Arrays.asList(new Object[][]{
            {3125, 5.0, 5}, {10534.4975, 2.525, 10}, {2097152, 2, 21},
            {802.7893339 ,1.112, 63}, {439286205.1, 1.01, 2000}, {-1, -1, 1000000},
            {1, 1, Integer.MAX_VALUE}, {-33554432, -2, 25},
            {1, 1, 2147483647}, {-0.00032, -5, -5}, {0.1380329672, 1.02, -100}
        });
    }
    
    public TestPower(double expected, double parameterB, int parameterN) {
        this.expected = expected;
        this.parameterB = parameterB;
        this.parameterN = parameterN;
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
    public void testPowerRecursive() {
        assertEquals(expected, testjunit_1.TestJUnit_1.POWER_RECURSIVE(parameterB, parameterN), 2);
    }
    
    @Test
    public void testPowerIterative() {
         assertEquals(expected, testjunit_1.TestJUnit_1.POWER_ITERATIVE(parameterB, parameterN), 2);
    }


}
