import org.junit.Assert;
import org.junit.Test;
import test_code.ArraysStatistics;

public class ArraysStatisticsTest {
    @Test
    public void minus1ShouldBeTheBiggest(){
        Assert.assertEquals(-1, ArraysStatistics.max(new int[]{-10,-5,-1,-2,-13}));
    }

    @Test
    public void threeShouldBeTheBiggest(){
        Assert.assertEquals(3, ArraysStatistics.max(new int[]{1,2,3,-1,0}));

    }

    @Test
    public void minimumShouldNotBePositiveNumber(){
        Assert.assertEquals(-5, ArraysStatistics.min(new int[]{10,-5,-1,19,13}));
    }

    @Test
    public void minimumShouldBe3(){
        Assert.assertEquals(3, ArraysStatistics.min(new int[]{100,88,33,24,3,10}));

    }

    @Test
    public void averageShouldBe3(){
        Assert.assertEquals(3.0, ArraysStatistics.avg(new int[]{3,3,3}),0.01);//3.99 i 3.98

    }

    @Test
    public void sumShouldBeNegativeNumber(){
        Assert.assertEquals(- 19, ArraysStatistics.sum(new int[]{-1,-1,-10,-4, -3}));
    }

    @Test
    public void sumShouldBe100(){
        Assert.assertEquals(110, ArraysStatistics.sum(new int[]{33,33,33,10,1}));

    }

}
