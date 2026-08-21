package org.example;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CalculatorTest {

    private Calculator calculator;

    // 5. BeforeMethod
    // This method runs before every test method.
    // It creates a new Calculator object before each test.
    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
    }

    // 5. AfterMethod
    // This method runs after every test method.
    // It cleans up the Calculator object.
    @AfterMethod
    public void tearDown() {
        calculator = null;
    }

    // 1. Parametrized test
    // DataProvider supplies several sets of test data.
    @DataProvider(name = "additionData")
    public Object[][] additionData() {
        return new Object[][]{
                {5, 4, 9},
                {10, 20, 30},
                {7, 3, 10}
        };
    }

    // 1. Parametrized test
    // 2. Groups
    // 4. Priority
    @Test(
            dataProvider = "additionData",
            groups = {"smoke", "calculator"},
            priority = 1
    )
    public void testAdd(double a, double b, double expected) {

        Assert.assertEquals(
                calculator.add(a, b),
                expected
        );
    }

    // 2. Groups
    // 3. Dependency
    // 4. Priority
    //
    // testMultiply depends on testAdd.
    // Therefore, testAdd must successfully finish first.
    @Test(
            groups = {"regression", "calculator"},
            dependsOnMethods = "testAdd",
            priority = 2
    )
    public void testMultiply() {

        Assert.assertEquals(
                calculator.multiply(5, 4),
                20.0
        );
    }

    // 2. Groups
    // 4. Priority
    @Test(
            groups = {"smoke", "regression"},
            priority = 3
    )
    public void testSubtract() {

        Assert.assertEquals(
                calculator.subtract(5, 6),
                -1.0
        );
    }

    // 6. Soft assertions
    //
    // SoftAssert collects all assertion failures
    // and continues executing the test.
    @Test(
            groups = {"regression", "calculator"},
            priority = 4
    )
    public void testAllOperations() {

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(
                calculator.add(5, 4),
                9.0
        );

        softAssert.assertEquals(
                calculator.subtract(5, 6),
                -1.0
        );

        softAssert.assertEquals(
                calculator.multiply(5, 4),
                20.0
        );

        // Required to report collected assertion failures.
        softAssert.assertAll();
    }
}