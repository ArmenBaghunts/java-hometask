package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By switchToStandardSearchButton =
            By.xpath("//button[text()='← Switch to standard search']");

    private By categoryDropdownInput =
            By.xpath("//span[@class='ant-select-selection-search']/input");

    private By categoryOption =
            By.xpath("//div[@class='rc-virtual-list-holder-inner']/div[8]");

    private By searchButton =
            By.xpath("//img[@alt='search-icon']");


    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public void switchToStandardSearch() {

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        switchToStandardSearchButton
                )
        ).click();
    }


    public void selectCategory() {

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        categoryDropdownInput
                )
        ).click();

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        categoryOption
                )
        ).click();
    }


    public void clickSearchButton() {

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        searchButton
                )
        ).click();
    }
}
