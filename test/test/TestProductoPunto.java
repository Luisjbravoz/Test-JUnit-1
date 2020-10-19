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

@RunWith(value = Parameterized.class)
public class TestProductoPunto {

    private double parameterVectorA[], parameterVectorB[], expected;

    @Parameterized.Parameters
    public static Iterable<Object[]> INIT() {
        return Arrays.asList(new Object[][]{
            {new double[]{1.2, 1.9, 0.5}, new double[]{0.9, 9.1, 1.5}, 19.12},
            {new double[]{1, 5, 10, 11}, new double[]{1, 4, 2, 10}, 151},
            {new double[]{0.4453, 3.1415}, new double[]{0.141516, 2.14567834}, 6.80366558},
            {new double[]{1, 4, 9}, new double[]{1, 2, 3}, 36.0}
        });
    }

    public TestProductoPunto(double parameterVectorA[], double parameterVectorB[], double expected) {
        this.parameterVectorA = parameterVectorA;
        this.parameterVectorB = parameterVectorB;
        this.expected = expected;
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
    public void testDotProductRecursive() throws Exception {
        assertEquals(expected, 
                testjunit_1.TestJUnit_1.DOT_PRODUCT_RECURSIVE(parameterVectorA, parameterVectorB),
                1);
    }

    @Test
    public void testDotProductIterative() throws Exception {
        assertEquals(expected, 
                testjunit_1.TestJUnit_1.DOT_PRODUCT_ITERATIVE(parameterVectorA, parameterVectorB),
                1);
    }
}
