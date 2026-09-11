package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JobsDetailPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By jobTitle = By.xpath("//h1[@dir]");

    private By employer = By.xpath(
            "//img[@alt='verified-icon']//parent::div"
    );

    private By deadline = By.xpath(
            "//img[@alt='calendarGreen']//parent::div//following-sibling::div"
    );

    private By location = By.xpath(
            "//h1[@dir]//following-sibling::div//div[text()]"
    );


    public JobsDetailPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public String getJobTitle() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(jobTitle)
        ).getText();
    }


    public String getEmployer() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(employer)
        ).getText();
    }


    public String getDeadline() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(deadline)
        ).getText();
    }


    public String getLocation() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(location)
        ).getText();
    }
}