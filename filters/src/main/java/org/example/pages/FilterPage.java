package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class FilterPage extends BaseObject {

     public FilterPage(WebDriver driver) {
        super(driver);
    }

    public void filter(String category, String filterName) {

        By viewMore = By.xpath(
                "//div[text()='" + category + "']" +
                        "//following-sibling::div/div[text()='View more']"
        );

        List<WebElement> viewMoreElements = driver.findElements(viewMore);

        if (!viewMoreElements.isEmpty()) {
            wait.until(
                    ExpectedConditions.elementToBeClickable(
                            viewMoreElements.get(0)
                    )
            ).click();
        }

        By filter = By.xpath(
                "//div[text()='" + category + "']" +
                        "//following-sibling::div//span[text()='" + filterName + "']"
        );

        wait.until(
                ExpectedConditions.elementToBeClickable(filter)
        ).click();
    }

    public void clickFilter() {
        wait.until(
                ExpectedConditions.elementToBeClickable(filter)
        ).click();
    }
}

