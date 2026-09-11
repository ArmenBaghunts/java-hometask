package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class JobsPage {

    private WebDriver driver;
    private WebDriverWait wait;

    // All job cards
    private By jobs = By.xpath(
            "//div[text()='View more']/parent::a/parent::div/parent::div/parent::div/parent::div/parent::div"
    );

    // Job information
    private By jobTitle = By.xpath(
            "//div[@id='ai-results-anchor']//following-sibling::div//a[@target]//div"
    );

    private By employer = By.xpath(
            "//div[@id='ai-results-anchor']//following-sibling::div//a[@target]/parent::div//following-sibling::div/a/div"
    );

    private By deadline = By.xpath(
            "//div[@id='ai-results-anchor']//following-sibling::div//a[@target]/parent::div//following-sibling::div[2]//div"
    );

    private By location = By.xpath(
            "//div[@id='ai-results-anchor']//following-sibling::div//a[@target]/parent::div//following-sibling::div[3]//div"
    );


    public JobsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public List<WebElement> getJobs() {
        return wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(jobs)
        );
    }


    public WebElement getRandomJob() {
        List<WebElement> jobsList = getJobs();

        Random random = new Random();

        return jobsList.get(
                random.nextInt(jobsList.size())
        );
    }


    public String getJobTitle(WebElement job) {
        return job.findElement(jobTitle).getText();
    }


    public String getEmployer(WebElement job) {
        return job.findElement(employer).getText();
    }


    public String getDeadline(WebElement job) {
        return job.findElement(deadline).getText();
    }


    public String getLocation(WebElement job) {
        return job.findElement(location).getText();
    }


    public void openJob(WebElement job) {
        job.click();
    }
}