package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StaffTest {

    @Test
    public void searchTest() {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://staff.am");


        HomePage homePage = new HomePage(driver);

        JobsResultPage jobsResultPage =
                new JobsResultPage(driver);


        homePage.switchToStandardSearch();

        homePage.selectCategory();

        homePage.clickSearchButton();


        System.out.println(
                jobsResultPage
                        .getClearFiltersElement()
                        .isDisplayed()
        );


        jobsResultPage.clickClearFilters();


        System.out.println(
                jobsResultPage
                        .getClearFiltersElement()
                        .isDisplayed()
        );


        driver.quit();
    }
}