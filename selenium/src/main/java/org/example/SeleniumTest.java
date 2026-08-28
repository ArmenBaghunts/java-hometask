package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {

    @Test
    public void addRedShirtToBasket() {

        WebDriver driver = new ChromeDriver();

        // Open SauceDemo
        driver.get("https://www.saucedemo.com/");

        // Login
        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
                .click();

        // Add the shirt to the basket
        driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
        driver.quit();


    }
}