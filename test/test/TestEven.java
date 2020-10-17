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
public class TestEven {
    
    private boolean expected;
    private long parameter;
    
    @Parameters
    public static Iterable<Object[]> INIT() {
        return Arrays.asList(new Object[][] {
            {true, Long.MIN_VALUE}, {true, 175332326834256L}, {true, 1772578123532L}, {true, -177257228532L}, 
            {true, 1919202032567551214L}, {true, -1919202032567551214L}, {false, Long.MAX_VALUE}, {false, 6091348711257889021L}, 
            {false, -6091348711257889021L}, {false, 123456879021021267L}, {false, -667886879021087543L}, {false, 76767676759L}
        });
    }

    public TestEven(boolean expected, long parameter) {
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
    public void testEvenFirstForm() {
        assertEquals(expected, testjunit_1.TestJUnit_1.EVEN_FIRST_FORM(parameter));

    }

    @Test
    public void testEvenSecondForm() {
        assertEquals(expected, testjunit_1.TestJUnit_1.EVEN_SECOND_FORM(parameter));
    }
}
