import org.example.Main;
import org.junit.Assert;
import org.junit.Test;
public class CalculatorTest {
    @Test
    public void testSquareRoot(){
        double input = 16.0;
        double expected = 4.0;
        double actual = Main.squareRoot(input);
        Assert.assertEquals(expected, actual, 0.001);
    }
    @Test
    public void testSquareRootNegative(){
        //Testing for a negative number (should throw an exception)

        try {
            Main.squareRoot(-4.0);
            Assert.fail("Expected IllegalArgumentException");

        }catch (IllegalArgumentException e){
            Assert.assertEquals(e.getMessage(), "Number must be non-negative.");
        }
    }

    @Test
    public void testFactorial(){
        int input = 5;
        long expected = 120L;
        long actual = Main.factorial(input);

        Assert.assertEquals(expected, actual, 0.001);
    }
    @Test
    public void testFactorialZero(){
        //Test factorial of 0
        Assert.assertEquals(Main.factorial(0), 1L, 0.001);
    }
    @Test
    public void testFactorialNegative(){
        //test for negative
        try {
            Main.factorial(-1);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Number must be non-negative.", e.getMessage());
        }
    }

    @Test
    public void testNaturalLogarithm(){
        double input = Math.E;
        double expected = 1.0;

        double actual = Main.naturalLogarithm(input);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testNaturalLogarithmOne(){
        //test for 1 (should return 0)
        Assert.assertEquals(Main.naturalLogarithm(1.0), 0.0, 0.001);

    }


        @Test
    public void testNaturalLogarithmZero(){
        //Test for negatives or 0
        try {
            Main.naturalLogarithm(0);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Number must be positive.", e.getMessage());
        }
    }

    @Test
    public void testPower(){
        double base = 2.0;
        int exponent = 3;
        double expected = 8.0;
        double actual = Main.power(base, exponent);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testPowerExponentZero(){
        double base = 2.0;
        // Test for exponent 0 (should return 1 for any base)
        Assert.assertEquals(1.0, Main.power(base, 0), 0.001);
    }

    @Test
    public void testPowerBaseZero(){
        // Test for base 0 and exponent 0 (should return 1)
        Assert.assertEquals(1.0, Main.power(0, 0), 0.001);
    }
}
