import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGTestsClass {

    @BeforeClass
    void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    void afterClass() {
        System.out.println("After Class");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("After renamedMethod");
        System.out.println("This is typed in the new branch");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("Before renamedMethod");
    }

    @Test
    public void greenTestNGTest() {
        System.out.println("testNGTest running");
        Assert.assertEquals(1, 1);
    }


    @Test
    public void yellowTestNGTestNegative() {
        System.out.println("testNGTestNegative running");
        Assert.assertEquals(1, 2);
    }

    @Test
    public void redTestNGTest() {
        System.out.println("testNGTestRed running");
        int i = 1 / 0;
        Assert.assertEquals(i, 1);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void greenTestNGTestExpectedException() {
        System.out.println("testNGTestExpectedException running");
        int i = 1 / 0;
        Assert.assertEquals(1, i);
    }

    @Ignore
    @Test
    public void grayTestNGTestIgnored() {
        System.out.println("testNGTestIgnored running");
        int i = 1 / 0;
        Assert.assertEquals(1, i);
    }

    @Test(successPercentage = 99, invocationCount = 5)
    public void testNGWithPercentage10() {
        for (int i = 0; i < 10; i++) {
            Assert.assertTrue(i < 5);
        }
    }
}