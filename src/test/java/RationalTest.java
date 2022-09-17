import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testSubtract() {
        Rational x = new Rational();
        x.numerator = 2;
        x.denominator = 3;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 3;
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(3, x.denominator);
    }

    @Test
    public void testMultiply() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 3;
        Rational y = new Rational();
        y.numerator = 3;
        y.denominator = 3;
        x.multiply(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(3, x.denominator);
    }

    @Test
    public void testDivide() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 4;
        Rational y = new Rational();
        y.numerator = 5;
        y.denominator = 2;
        x.divide(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(10, x.denominator);
    }

    @Test
    public void testEquals() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 5;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 5;
        x.equals(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(5, x.denominator);
    }

    @Test
    public void testCompareTo() {
        Rational x = new Rational();
        x.numerator = 2;
        x.denominator = 5;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 10;
        Rational z = new Rational();
        z.numerator = 2;
        z.denominator = 3;
        Rational w = new Rational();
        w.numerator = 2;
        w.denominator = 5;
        Assert.assertEquals(-1, x.compareTo(y));
        Assert.assertEquals(1, x.compareTo(z));
        Assert.assertEquals(0, x.compareTo(w));
    }

    @Test
    public void testToString() {
        Rational x = new Rational();
        x.numerator = 2;
        x.denominator = 5;
        Assert.assertEquals("2/5",x.toString());
    }
}
