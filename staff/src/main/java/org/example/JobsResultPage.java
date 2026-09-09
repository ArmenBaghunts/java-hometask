package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JobsResultPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By clearFilters =
            By.xpath("//div[text()='Clear filters']");


    public JobsResultPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public WebElement getClearFiltersElement() {

        return wait.until(
                ExpectedConditions.elementToBeClickable(
                        clearFilters
                )
        );
    }


    public void clickClearFilters() {

        getClearFiltersElement().click();
    }
}
