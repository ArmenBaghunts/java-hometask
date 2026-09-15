package org.example.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.example.pages.JobsDetailPage;
import org.example.pages.JobsPage;

public class JobsTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://staff.am/jobs");
    }

    @Test
    public void verifyRandomJobInformation() {

        JobsPage jobsPage = new JobsPage(driver);

        // Select random job
        WebElement randomJob = jobsPage.getRandomJob();

        // Get information from the job card
        String jobTitle = jobsPage.getJobTitle(randomJob);
        String employer = jobsPage.getEmployer(randomJob);
        String deadline = jobsPage.getDeadline(randomJob);
        String location = jobsPage.getLocation(randomJob);

        // Open the selected job
        jobsPage.openJob(randomJob);

        // Create details page
        JobsDetailPage jobDetailsPage = new JobsDetailPage(driver);

        // Get information from details page
        String detailsJobTitle = jobDetailsPage.getJobTitle();
        String detailsEmployer = jobDetailsPage.getEmployer();
        String detailsDeadline = jobDetailsPage.getDeadline();
        String detailsLocation = jobDetailsPage.getLocation();

        // Compare the information
        Assert.assertEquals(detailsJobTitle, jobTitle);
        Assert.assertEquals(detailsEmployer, employer);
        Assert.assertEquals(detailsDeadline, deadline);
        Assert.assertEquals(detailsLocation, location);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}