/*
 * LUIS J. BRAVO ZÚÑIGA
 * TESTING WITH JUNIT.
 */
package testjunit_1;

import java.util.Arrays;
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
        if (b == 0.0 && n == 0) {
            throw new ArithmeticException("INDETERMINATE FORM");
        } else {
            if (n > 0) {
                return AUX_POWER(b, n);
            }
            if (n < 0) {
                return 1 / (AUX_POWER(b, n * - 1) * -1);
            }
            return 1.0;
        }
    }

    private static double AUX_POWER(double b, int n) {
        if (n == 0) {
            return 1.0;
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
        if (b == 0.0 && n == 0) {
            throw new ArithmeticException("INDETERMINATE FORM");
        } else {
            if (n > 0) {
                return AUX_POWER_ITERATIVE(b, n);
            } else if (n < 0) {
                return 1 / (AUX_POWER_ITERATIVE(b, n * -1) * -1);
            }
        }
        return 1.0;
    }

    private static double AUX_POWER_ITERATIVE(double b, int n) {
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
    public static void QUICKSORT(int[] array, boolean asc) {
        AUX_QUICKSORT(array, 0, array.length - 1, asc);
    }

    private static void AUX_QUICKSORT(int[] array, int low, int high, boolean asc) {
        if (low < high) {
            int p = PARTITION(array, low, high, asc);
            AUX_QUICKSORT(array, low, p - 1, asc);
            AUX_QUICKSORT(array, p + 1, high, asc);
        }
    }

    private static int PARTITION(int[] array, int low, int high, boolean asc) {
        int pivote = array[high], i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (asc) {
                if (array[j] < pivote) {
                    int c = array[++i];
                    array[i] = array[j];
                    array[j] = c;
                }
            } else {
                if (array[j] > pivote) {
                    int c = array[++i];
                    array[i] = array[j];
                    array[j] = c;
                }
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

    public static void main(String[] args) {
        Object array[] = {2711, 1171, 7474, 6666, 6397, 7828, 5522, 2923, 2800, 4538, 8978, 9408, 4612, 7682, 4031, 2188, 1105, 57, 5074, 4538, 8107, 8815, 2918};
        int array2[] = {1604, 3735, 9955, 8615, 3234, 8898, 7300, 3130, 5018, 8356, 262, 3159, 5250, 229, 7009, 3784, 2068, 442, 7822, 9961, 6566, 3958, 3627, 1607, 4727, 7579, 4308, 259, 4808, 6201, 1764, 2869, 9588, 6215, 1879, 2349, 606, 415, 3243, 6709, 6198, 6850, 2323, 8995, 1399, 1869, 4663, 9355, 4192, 4100, 1292, 6736, 8349, 2507, 715};
        int array3[] = {299, 4428, 9778, 305, 8297, 8661, 4431, 7386, 8543, 9109, 5799, 7774, 9838, 9700, 6184, 8936, 4924, 7833, 2609, 7302, 356, 7530, 6493, 8973, 810, 3058, 1881, 7226, 4984, 4288, 4676, 9811, 6057, 6412, 8722, 2924, 6097, 8116, 1709, 8166, 40, 3893, 1720};
        int array4[] = {0, 25, 34, 30, 1, 21, 27, 4, 38, 33, 8, 3, 41, 38, 1, 42, 30, 25, 49, 32, 8, 6, 28, 26, 26, 39, 9, 28, 8, 26, 45, 45, 20, 9, 47, 28};
        int array5[] = {48, 0, 35, 25, 0, 44, 41, 29, 29, 18, 6, 47, 27, 45, 28, 23, 32, 33, 9, 40, 34, 28, 26, 8, 47, 15, 23, 22, 22, 22, 45, 28, 41, 24, 43, 3, 23, 34, 48, 24, 36, 6, 21, 48, 33};

        
                int[] arrayint = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            arrayint[i] = ((Integer)array[i]);
        }

        QUICKSORT(arrayint, true);
        QUICKSORT(array2, true);
        QUICKSORT(array3, false);
        QUICKSORT(array4, true);
        QUICKSORT(array5, false);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
        System.out.println(Arrays.toString(array5));

    }

}
