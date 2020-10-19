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
import testjunit_1.TestJUnit_1;

public class TestQuicksort {

    /*
    @Parameterized.Parameters
    public static Iterable<Object[]> INIT() {
        return Arrays.asList(new Object[][]{
            },

            {new Object[] {0, 1, 1, 3, 4, 6, 8, 8, 8, 9, 9, 20, 21, 25, 25, 26, 26, 26, 27, 28, 28, 28, 30, 30, 32, 33, 34, 38, 38, 39, 41, 42, 45, 45, 47, 49},
             new Object[]{0, 25, 34, 30, 1, 21, 27, 4, 38, 33, 8, 3, 41, 38, 1, 42, 30, 25, 49, 32, 8, 6, 28, 26, 26, 39, 9, 28, 8, 26, 45, 45, 20, 9, 47, 28}, 
             true},
            
            {new Object[] {48, 48, 48, 47, 47, 45, 45, 44, 43, 41, 41, 40, 36, 35, 34, 34, 33, 33, 32, 29, 29, 28, 28, 28, 27, 26, 25, 24, 24, 23, 23, 23, 22, 22, 22, 21, 18, 15, 9, 8, 6, 6, 3, 0, 0},
             new Object[]{48, 0, 35, 25, 0, 44, 41, 29, 29, 18, 6, 47, 27, 45, 28, 23, 32, 33, 9, 40, 34, 28, 26, 8, 47, 15, 23, 22, 22, 22, 45, 28, 41, 24, 43, 3, 23, 34, 48, 24, 36, 6, 21, 48, 33}, 
             false}
        });
    }
     */
    public TestQuicksort() {
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
    public void testQuicksort_1() {
        int[] expected = {57, 1105, 1171, 2188, 2711, 2800, 2918, 2923, 4031, 4538, 4538, 4612, 5074, 5522, 6397, 6666, 7474, 7682, 7828, 8107, 8815, 8978, 9408};
        int[] parameter = {2711, 1171, 7474, 6666, 6397, 7828, 5522, 2923, 2800, 4538, 8978, 9408, 4612, 7682, 4031, 2188, 1105, 57, 5074, 4538, 8107, 8815, 2918};
        testjunit_1.TestJUnit_1.QUICKSORT(parameter, true);
        assertArrayEquals(expected, parameter);
    }

    @Test
    public void testQuicksort_2() {
        int[] expected = {229, 259, 262, 415, 442, 606, 715, 1292, 1399, 1604, 1607, 1764, 1869, 1879, 2068, 2323, 2349, 2507, 2869, 3130, 3159, 3234, 3243, 3627, 3735, 3784, 3958, 4100, 4192, 4308, 4663, 4727, 4808, 5018, 5250, 6198, 6201, 6215, 6566, 6709, 6736, 6850, 7009, 7300, 7579, 7822, 8349, 8356, 8615, 8898, 8995, 9355, 9588, 9955, 9961};
        int[] parameter = {1604, 3735, 9955, 8615, 3234, 8898, 7300, 3130, 5018, 8356, 262, 3159, 5250, 229, 7009, 3784, 2068, 442, 7822, 9961, 6566, 3958, 3627, 1607, 4727, 7579, 4308, 259, 4808, 6201, 1764, 2869, 9588, 6215, 1879, 2349, 606, 415, 3243, 6709, 6198, 6850, 2323, 8995, 1399, 1869, 4663, 9355, 4192, 4100, 1292, 6736, 8349, 2507, 715};
        testjunit_1.TestJUnit_1.QUICKSORT(parameter, true);
        assertArrayEquals(expected, parameter);
    }

    @Test
    public void testQuicksort_3() {
        int[] expected =  {9838, 9811, 9778, 9700, 9109, 8973, 8936, 8722, 8661, 8543, 8297, 8166, 8116, 7833, 7774, 7530, 7386, 7302, 7226, 6493, 6412, 6184, 6097, 6057, 5799, 4984, 4924, 4676, 4431, 4428, 4288, 3893, 3058, 2924, 2609, 1881, 1720, 1709, 810, 356, 305, 299, 40};
        int[] parameter = {9838, 9811, 9778, 9700, 9109, 8973, 8936, 8722, 8661, 8543, 8297, 8166, 8116, 7833, 7774, 7530, 7386, 7302, 7226, 6493, 6412, 6184, 6097, 6057, 5799, 4984, 4924, 4676, 4431, 4428, 4288, 3893, 3058, 2924, 2609, 1881, 1720, 1709, 810, 356, 305, 299, 40};
        testjunit_1.TestJUnit_1.QUICKSORT(parameter, false);
        assertArrayEquals(expected, parameter);
    }

    @Test
    public void testQuicksort_4() {
        int[] expected = {0, 1, 1, 3, 4, 6, 8, 8, 8, 9, 9, 20, 21, 25, 25, 26, 26, 26, 27, 28, 28, 28, 30, 30, 32, 33, 34, 38, 38, 39, 41, 42, 45, 45, 47, 49};
        int[] parameter = {0, 25, 34, 30, 1, 21, 27, 4, 38, 33, 8, 3, 41, 38, 1, 42, 30, 25, 49, 32, 8, 6, 28, 26, 26, 39, 9, 28, 8, 26, 45, 45, 20, 9, 47, 28};
        testjunit_1.TestJUnit_1.QUICKSORT(parameter, true);
        assertArrayEquals(expected, parameter);
    }

    @Test
    public void testQuicksort_5() {
        int[] expected = {48, 48, 48, 47, 47, 45, 45, 44, 43, 41, 41, 40, 36, 35, 34, 34, 33, 33, 32, 29, 29, 28, 28, 28, 27, 26, 25, 24, 24, 23, 23, 23, 22, 22, 22, 21, 18, 15, 9, 8, 6, 6, 3, 0, 0};
        int[] parameter = {48, 0, 35, 25, 0, 44, 41, 29, 29, 18, 6, 47, 27, 45, 28, 23, 32, 33, 9, 40, 34, 28, 26, 8, 47, 15, 23, 22, 22, 22, 45, 28, 41, 24, 43, 3, 23, 34, 48, 24, 36, 6, 21, 48, 33};
        testjunit_1.TestJUnit_1.QUICKSORT(parameter, false);
        assertArrayEquals(expected, parameter);
    }

}
