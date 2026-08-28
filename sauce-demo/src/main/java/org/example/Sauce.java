package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sauce{

    @Test
    public void addTShirtAndCheckout() {

        // Open browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open SauceDemo
        driver.get("https://www.saucedemo.com/");


        // 1. Login
        driver.findElement(By.xpath("//input[@id='user-name']"))
                .sendKeys("standard_user");

        driver.findElement(By.xpath("//input[@id='password']"))
                .sendKeys("secret_sauce");

        driver.findElement(By.xpath("//input[@id='login-button']"))
                .click();


        // 2. Add T-shirt to cart
        driver.findElement(By.xpath(
                "//div[@class='inventory_item' and .//div[text()='Test.allTheThings() T-Shirt (Red)']]//button"
        )).click();


        // 3. Verify cart quantity
        WebElement cartBadge = driver.findElement(
                By.xpath("//span[@class='shopping_cart_badge']")
        );

        Assert.assertEquals(
                cartBadge.getText(),
                "1",
                "Cart quantity should be 1"
        );


        // 4. Open cart
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']"))
                .click();


        // 5. Verify correct product
        WebElement productName = driver.findElement(
                By.xpath("//div[@class='inventory_item_name']")
        );

        Assert.assertEquals(
                productName.getText(),
                "Test.allTheThings() T-Shirt (Red)",
                "Incorrect product in cart"
        );


        // 6. Get product price
        WebElement productPrice = driver.findElement(
                By.xpath("//div[@class='inventory_item_price']")
        );

        double itemPrice = Double.parseDouble(
                productPrice.getText().replace("$", "")
        );


        // 7. Checkout
        driver.findElement(By.xpath("//button[@id='checkout']"))
                .click();


        // 8. Enter customer information
        driver.findElement(By.xpath("//input[@id='first-name']"))
                .sendKeys("Armen");

        driver.findElement(By.xpath("//input[@id='last-name']"))
                .sendKeys("Baghunts");

        driver.findElement(By.xpath("//input[@id='postal-code']"))
                .sendKeys("3201");


        // 9. Continue
        driver.findElement(By.xpath("//input[@id='continue']"))
                .click();


        // 10. Get Item Total
        WebElement itemTotalElement = driver.findElement(
                By.xpath("//div[@class='summary_subtotal_label']")
        );

        double itemTotal = Double.parseDouble(
                itemTotalElement.getText()
                        .replace("Item total: $", "")
        );


        // 11. Verify Item Total
        Assert.assertEquals(
                itemTotal,
                itemPrice,
                0.001,
                "Item total is incorrect"
        );


        // 12. Get Tax
        WebElement taxElement = driver.findElement(
                By.xpath("//div[@class='summary_tax_label']")
        );

        double tax = Double.parseDouble(
                taxElement.getText()
                        .replace("Tax: $", "")
        );


        // 13. Get Final Total
        WebElement totalElement = driver.findElement(
                By.xpath("//div[@class='summary_total_label']")
        );

        double actualTotal = Double.parseDouble(
                totalElement.getText()
                        .replace("Total: $", "")
        );


        // 14. Calculate expected total
        double expectedTotal = itemTotal + tax;


        // 15. Verify final price
        Assert.assertEquals(
                actualTotal,
                expectedTotal,
                0.001,
                "Final total is incorrect"
        );


        // Close browser
        driver.quit();
    }
}