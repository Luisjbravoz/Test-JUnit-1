package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestBinarySearch {
    
    private static final int[] PARAMETER = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 
                                            21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 
                                            41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 
                                            61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 
                                            81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
    
    public TestBinarySearch() {
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
    public void testBinarySearch_1() {
        assertEquals(99, testjunit_1.TestJUnit_1.BINARY_SEARCH(PARAMETER, 99));
    }

    @Test
    public void testBinarySearch_2() {
        assertEquals(50, testjunit_1.TestJUnit_1.BINARY_SEARCH(PARAMETER, 50));
    }

    @Test
    public void testBinarySearch_3() {
        assertEquals(1, testjunit_1.TestJUnit_1.BINARY_SEARCH(PARAMETER, 1));
    }

    @Test
    public void testBinarySearch_4() {
        assertEquals(22, testjunit_1.TestJUnit_1.BINARY_SEARCH(PARAMETER, 22));
    }

    @Test
    public void testBinarySearch_5() {
        assertEquals(78, testjunit_1.TestJUnit_1.BINARY_SEARCH(PARAMETER, 78));
    }
}
