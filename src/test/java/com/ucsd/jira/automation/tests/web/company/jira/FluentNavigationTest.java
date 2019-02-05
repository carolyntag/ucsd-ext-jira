package com.ucsd.jira.automation.tests.web.company.jira;

import com.ucsd.jira.automation.frameworksupport.Groups;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class FluentNavigationTest {

    @BeforeTest
    public static void setUp() {

    }

    @AfterTest
    public static void tearDown() {

    }

    @Test(groups = {Groups.ACCEPTANCE_TEST})
    public void testFluentNavigation() {

        System.setProperty("webdriver.chrome.driver", "C:\\workspace\\ucsd-ext-jira\\target\\test-classes\\drivers\\chrome\\chrome_win.exe");
        WebDriver driver = new ChromeDriver();

        Wait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(10))
                .ignoring(Exception.class);

        driver.get("https://ucsd-ext.atlassian.net");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ucsd.ext1@gmail.com");
        driver.findElement(By.xpath("//span[text()='Continue']")).click();

        WebElement passwordElement = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));
        passwordElement.sendKeys("Murray08");

        driver.findElement(By.xpath("//span[text()='Log in']")).click();

        WebElement dashboardElement = (WebElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Dashboards']")));
        Assert.assertTrue("Dashboard item is displayed", dashboardElement.isDisplayed());

        driver.quit();

    }


}

