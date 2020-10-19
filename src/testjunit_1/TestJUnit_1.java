/*
 * LUIS J. BRAVO ZÚÑIGA
 * TESTING WITH JUNIT.
 */
package testjunit_1;

import java.util.Random;

public class TestJUnit_1 {

    /*
     * TEST #1
     * PARITY OF NUMBERS.
     * IN MATHEMATICS, PARITY IS THE PROPERTY OF AN INTEGERS NUMBER IN ONE OF
     * TWO CATEGORIES: EVEN OR ODD.
     * AN INTEGER NUMBER IS EVEN IF IT IS DIVISIBLE BY TWO AND ODD IF IS NOT EVEN.
     * EVEN = {2K \ K IS A INTEGER}
     * ODD = {2K + 1 \ K IS A INTEGER}
     */
    public static boolean EVEN_FIRST_FORM(long number) {
        return (number & 1) == 0;
    }

    public static boolean EVEN_SECOND_FORM(long number) {
        return (number % 2) == 0;
    }

    /*
     * TEST #2
     * FACTORIAL
     * IN MATHEMATICS, FACTORIAL OF A POSITIVE INTEGER NUMBER (K)
     * DENOTED BY N!.
     * IS THE PRODUCT OF ALL POSITIVE INTEGERS LESS THAN OR EQUAL TO K.
     * THAT'S IT:
     * IF K > 0 THEN K * (K-1)!
     * IF K = 0 THEN 1.
     */
    // RECURSION FORM
    public static long FACTORIAL_RECURSIVE(int k) {
        if (k < 0) {
            throw new ArithmeticException("ARGUMENT IS NOT A POSITIVE INTEGER NUMBER");
        }
        return AUX_FACTORIAL_RECURSIVE(k, 1L);
    }

    private static long AUX_FACTORIAL_RECURSIVE(int k, long result) {
        if (k == 0) {
            return result;
        }
        return AUX_FACTORIAL_RECURSIVE(k - 1, result * k);
    }

    // ITERATIVE FORM
    public static long FACTORIAL_ITERATIVE(int k) {
        if (k < 0) {
            throw new ArithmeticException("ARGUMENT IS NOT A POSITIVE INTEGER NUMBER");
        }
        long result = 1L;
        while (k-- > 0) {
            result += k * result;
        }
        return result;
    }

    /*
     * TEST #3
     * FIBONACCI SEQUENCE
     * IN MATHEMATICS, FIBONACCI SEQUENCES IS A GROUP OF NUMBERS
     * CALLED FIBONACCI NUMBERS, SUCH THAT NUMBER IS THE SUM OF THE
     * TWO PROCEDDING ONES. SEQUENCES START FROM 0 AND 1.
     * DENOTED BY Fn.
     * THAT'S IT:
     * IF N > 1 THEN Fn-1 + Fn-2
     * IF N = 1 THEN 1.
     * IF K = 0 THEN 0.
     */
    // RECURSION FORM
    public static long FIBONACCI_RECURSIVE(int n) {
        if (n > 0) {
            return AUX_FIBONACCI_RECURSIVE(n - 1, 1L, 0L, 0L, 1L, 0L);
        } else if (n < 0) {
            if (EVEN_FIRST_FORM(n)) {
                return AUX_FIBONACCI_RECURSIVE((n * -1) - 1, 1L, 0L, 0L, 1L, 0L) * -1;
            } else {
                return AUX_FIBONACCI_RECURSIVE((n * -1) - 1, 1L, 0L, 0L, 1L, 0L);
            }
        }
        return 0L;
    }

    private static long AUX_FIBONACCI_RECURSIVE(int i, long a, long b, long c, long d, long temporal) {
        if (i <= 0) {
            return a + b;
        }
        if (!EVEN_FIRST_FORM(i)) {
            temporal = d * (b + a) + c * b;
            a = d * b + c * a;
            b = temporal;
        }
        temporal = d * (2 * c + d);
        return AUX_FIBONACCI_RECURSIVE(i / 2, a, b, c * c + d * d, temporal, d * (2 * c + d));
    }

    // ITERATIVE FORM
    public static long FIBONACCI_ITERATIVE(int n) {
        if (n > 0) {
            return AUX_FIBONACCI_ITERATIVE(n);
        } else if (n < 0) {
            if (EVEN_FIRST_FORM(n)) {
                return AUX_FIBONACCI_ITERATIVE(n * -1) * -1;
            } else {
                return AUX_FIBONACCI_ITERATIVE(n * -1);
            }
        }
        return 0L;
    }

    private static long AUX_FIBONACCI_ITERATIVE(int n) {
        long a = 1L, b = 0L, c = 0L, d = 1L, temporal = 0L;
        for (int i = n - 1; i > 0; i /= 2) {
            if (!EVEN_FIRST_FORM(i)) {
                temporal = d * (b + a) + c * b;
                a = d * b + c * a;
                b = temporal;
            }
            temporal = d * (2 * c + d);
            c = c * c + d * d;
            d = temporal;
        }
        return a + b;
    }

    /*
     * TEST #4
     * EXPONENTIATION.
     * IS A BINARY MATHEMATICAL OPERATION.
     * BASE B AND POWER N.
     * IF N > 0 THEN B^N IS THE PRODUCT OF MULTIPLYING N BASES.
     * IF N = 0 THEN B^N IS 1.
     * IF N < 0 THEN B^N IS 1 / B^N.
     * FINALLY, 0^0 IS AN INDETERMINATE FORM.
     */
    //RECURSION FORM
    public static double POWER_RECURSIVE(double b, int n) {
        if (b == 0 && n == 0) {
            throw new ArithmeticException("INDETERMINATE FORM");
        } else {
            if (n > 0) {
                return AUX_POWER(b, n);
            }
            if (n < 0) {
                return 1 / AUX_POWER(b, n);
            }
            return 1;
        }
    }

    private static double AUX_POWER(double b, int n) {
        if (n == 0) {
            return 1;
        }
        if (EVEN_FIRST_FORM(n)) {
            return CUAD(AUX_POWER(b, n / 2));
        }
        return b * CUAD(AUX_POWER(b, (n - 1) / 2));
    }

    private static double CUAD(double x) {
        return x * x;
    }

    //ITERATIVE FORM
    public static double POWER_ITERATIVE(double b, int n) {
        if (b == 0 && n == 0) {
            throw new ArithmeticException("INDETERMINATE FORM");
        }
        double result = 1.0;
        for (int i = 31 - Integer.numberOfLeadingZeros(n); i >= 0; --i) {
            result *= result;
            if ((n & (1 << i)) > 0) {
                result *= b;
            }
        }
        return result;
    }

    /*
     * TEST #5
     * DOT PRODUCT.
     * IS AN ALGEBRAIC OPERATION THAT TAKES TWO EQUAL-LENGTH
     * SEQUENCES OF NUMBERS (USUALLY COORDINATE VECTORS), AND RETURNS
     * A REAL NUMBER.
     */
    //RECURSION FORM
    public static double DOT_PRODUCT_RECURSIVE(double[] a, double[] b) throws Exception {
        if (a.length == b.length) {
            return AUX_DOT_PRODUCT(a, b, 0.0, 0);
        }
        throw new Exception("VECTORS HAVE DIFFERENT DIMENSIONAL SPACE");
    }

    private static double AUX_DOT_PRODUCT(double[] a, double[] b, double result, int index) {
        if (index == a.length) {
            return result;
        }
        return AUX_DOT_PRODUCT(a, b, result + (b[index] * a[index]), index + 1);
    }

    //ITERATIVE FORM
    public static double DOT_PRODUCT_ITERATIVE(double[] a, double[] b) throws Exception {
        if (a.length == b.length) {
            double result = 0.0;
            for (int i = 0; i < a.length; i++) {
                result += a[i] * b[i];
            }
            return result;
        }
        throw new Exception("VECTORS HAVE DIFFERENT DIMENSIONAL SPACE");
    }

    /*
     * TEST #6
     * QUICKSORT.
     */
    public static void QUICKSORT(int[] array) {
        AUX_QUICKSORT(array, 0, array.length - 1);
    }

    private static void AUX_QUICKSORT(int[] array, int low, int high) {
        if (low < high) {
            int p = PARTITION(array, low, high);
            AUX_QUICKSORT(array, low, p - 1);
            AUX_QUICKSORT(array, p + 1, high);
        }
    }

    private static int PARTITION(int[] array, int low, int high) {
        int pivote = array[high], i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (array[j] < pivote) {
                int c = array[++i];
                array[i] = array[j];
                array[j] = c;
            }
        }
        int c = array[++i];
        array[i] = array[high];
        array[high] = c;
        return i;
    }

    /*
     * TEST #7
     * BINARY SEARCH.
     */
    public static int BINARY_SEARCH(int array[], int x) {
        return AUX_BINARY_SEARCH(array, 0, array.length - 1, x);
    }

    private static int AUX_BINARY_SEARCH(int array[], int low, int high, int x) {
        if (high >= low) {
            int middle = low + (high - low) / 2;
            if (array[middle] == x) {
                return middle;
            }
            if (array[middle] > x) {
                return AUX_BINARY_SEARCH(array, low, middle - 1, x);
            }
            return AUX_BINARY_SEARCH(array, middle + 1, high, x);
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        int x[] = {1, 4, 6, 10, 11, 15};
        int i = 0, j = 0;
        Random ran = new Random();
        while (i++ <= 9) {
            j = ran.nextInt(90);
            System.out.printf("%d, %d \n", FIBONACCI_RECURSIVE(-j), -j);
        }
        System.out.println("hola mundo!");
        //System.out.println(FIBONACCI_RECURSIVE(-500));
    }

}
