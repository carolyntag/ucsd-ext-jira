package com.ucsd.jira.automation.tests.web.company.jira.examples;

import com.ucsd.jira.automation.frameworksupport.Groups;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExplicitNavigationTest {

    @BeforeTest
    public static void setUp() {

    }

    @AfterTest
    public static void tearDown() {

    }

    @Test(groups = {Groups.ACCEPTANCE_TEST})
    public void testExplicitNavigation() {

        System.setProperty("webdriver.chrome.driver", "C:\\workspace\\ucsd-ext-jira\\target\\test-classes\\drivers\\chrome\\chrome_win.exe");
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, 50);

        driver.get("https://ucsd-ext.atlassian.net");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ucsd.ext1@gmail.com");
        driver.findElement(By.xpath("//span[text()='Continue']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Murray08");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Log in']")));
        driver.findElement(By.xpath("//span[text()='Log in']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Dashboards']")));
        Assert.assertTrue("Dashboard item is displayed", driver.findElement(By.xpath("//div[text()='Dashboards']")).isDisplayed());

        driver.quit();

    }


}

