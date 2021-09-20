package com.moneygaming.tests;

import com.moneygaming.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AliTest2 {

    @Test
    public void test2() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.co.uk/");
        WebElement inputBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        inputBox.sendKeys("SamsungQLED 55inc TV");
        WebElement clickButton = driver.findElement(By.cssSelector("#nav-search-submit-button"));
        clickButton.click();
    }

}
