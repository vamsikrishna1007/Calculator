import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class calTest {
    private Main uncalculator;
    @Before
    public void setUp() {
        uncalculator = new Main();
    }
    @Test
    public void test_add() {
        int a = 2;
        int aa = 2;
        int expectedResult = 4;
        int result = uncalculator.add(a,aa);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test_subt() {
        int a = 2;
        int aa = 2;
        int expectedResult = 0;
        int result = uncalculator.subt(a,aa);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test_mul() {
        int a = 2;
        int aa = 2;
        int expectedResult = 4;
        int result = uncalculator.mul(a,aa);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test_per() {
        int a = 2;
        int b = 5;
        int expectedResult = 2;
        int result = uncalculator.per(a,b);
        Assert.assertEquals(expectedResult, result);
    }
}