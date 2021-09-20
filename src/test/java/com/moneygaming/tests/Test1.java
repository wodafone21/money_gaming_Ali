package com.moneygaming.tests;

import com.moneygaming.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //get the page
        driver.get("https://moneygaming.qa.gameaccount.com/sign-up.shtml");

    }

    @Test
    public void test1() throws InterruptedException {
        WebElement nameBox = driver.findElement(By.cssSelector("#forename"));
        nameBox.sendKeys("Mike");
        WebElement surnameBox = driver.findElement(By.xpath("//input[@name='map(lastName)']"));
        surnameBox.sendKeys("Smith");
        Thread.sleep(2000);

    }

    @Test
    public void test2() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.co.uk/");
        WebElement inputBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        inputBox.sendKeys("SamsungQLED TV");
        WebElement clickButton = driver.findElement(By.cssSelector("#nav-search-submit-button"));
        clickButton.click();



    }

    @AfterMethod
    public void tearDown() {

    }

}
