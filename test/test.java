import main.calculator;
import org.junit.Before;
import org.junit.jupiter.api.*;
import java.util.Random;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class test {

    @Before
    public void init() {

        calc = new calculator();
    }
    @Test
    public void testAdd()
    {
        int a = random();
        int b = random();
        int c = random();
        int d = random();
        assertEquals(calc.add(a, b), a + b);
        assertEquals(calc.add(c, d), c + d);
    }
    @Test
    public void testMinus()
    {
        int a = random();
        int b = random();
        int c = random();
        int d = random();
        assertEquals(calc.minus(a, b), a - b);
        assertEquals(calc.minus(c, d), c - d);
    }
    @Test
    public void testMultiply()
    {
        int a = random();
        int b = random();
        int c = random();
        int d = random();
        assertEquals(calc.multiply(a, b), a * b);
        assertEquals(calc.multiply(c, d), c * d);
    }
    @Test
    public void testDivide()
    {
        int a = random();
        int b = random();
        int c = random();
        int d = random();
        assertEquals(calc.divide(a, b), a/b);
        assertEquals(calc.divide(c, d), c/d);
    }
    @Test
    public void testDivideZero() {
        int a = random();
        int b = 0;
        int d = random();
        assertThrows(IllegalArgumentException.class,() -> {calc.divide(a,b); });
        assertThrows(IllegalArgumentException.class,() -> {calc.divide(d,b); });

    }


    private final int MAX = 999;
    private final Random R = new Random();
    private calculator calc;

    private int random() {
        return R.nextInt(MAX) + 1;
    }

}



