import org.junit.Assert;
import org.junit.Test;
import test_code.Calculator;

public class CalculatorTest {
    @Test
    public void fiveToTwoShouldReturn25(){
        Assert.assertEquals(25, Calculator.power(5,2));

    }

    @Test
    public void fiveToZeroShouldReturn1(){
        Assert.assertEquals(1,Calculator.power(5,0));

    }

    @Test
    public void nwdTest(){
        Assert.assertEquals(10, Calculator.NWD(100,30));

    }

    @Test
    public void isDivisible(){
        Assert.assertTrue(Calculator.isDivisible(333,111));

    }

    @Test
    public void isNotDivisible(){
        Assert.assertFalse(Calculator.isDivisible(78,0));

    }

}
