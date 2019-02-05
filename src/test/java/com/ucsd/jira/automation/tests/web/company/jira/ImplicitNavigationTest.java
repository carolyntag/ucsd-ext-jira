package com.ucsd.jira.automation.tests.web.company.jira;

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

import java.util.concurrent.TimeUnit;

public class ImplicitNavigationTest {

    @BeforeTest
    public static void setUp() {

    }

    @AfterTest
    public static void tearDown() {

    }

    @Test(groups = {Groups.ACCEPTANCE_TEST})
    public void testImplicitNavigation() {

        System.setProperty("webdriver.chrome.driver", "C:\\workspace\\ucsd-ext-jira\\target\\test-classes\\drivers\\chrome\\chrome_win.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://ucsd-ext.atlassian.net");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ucsd.ext1@gmail.com");
        driver.findElement(By.xpath("//span[text()='Continue']")).click();

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Murray08");

        driver.findElement(By.xpath("//span[text()='Log in']")).click();

        Assert.assertTrue("Dashboard item is displayed", driver.findElement(By.xpath("//div[text()='Dashboards']")).isDisplayed());

        driver.quit();

    }


}

