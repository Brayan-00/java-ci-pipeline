package test;

import main.calculator;


/** JUnit */
import org.junit.Before;
import org.junit.Test;
/** For my code */
import java.util.*;

import static org.junit.Assert.assertEquals;

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
        assertEquals(calc.add(c, d), c - d);
    }
    @Test
    public void testMultiply()
    {
        int a = random();
        int b = random();
        int c = random();
        int d = random();
        assertEquals(calc.multiply(a, b), a * b);
        assertEquals(calc.add(c, d), c * d);
    }
    @Test
    public void testDivide()
    {
        int a = random();
        int b = random();
        int c = random();
        int d = random();
        assertEquals(calc.divide(a, b), a/b);
        assertEquals(calc.add(c, d), c/d);
    }
    @Test(expected=IllegalArgumentException.class)
    public void testDivideZero() {
        int a = random();
        int b = 0;
        int d = random();
        calc.divide(a,b);
        calc.divide(d,b);
    }


    private final int MAX = 999;
    private final Random R = new Random();
    private calculator calc;

    private int random() {
        return R.nextInt(MAX) + 1;
    }
    public static void main(String[] args) {
        test tst = new test();
        tst.testAdd();
        tst.testDivide();
        tst.testMinus();
        tst.testMultiply();
    }


}



