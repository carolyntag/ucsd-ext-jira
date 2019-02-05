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

public class MandatoryPiecesTest {

    @BeforeTest
    public static void setUp() {

    }

    @AfterTest
    public static void tearDown() {

    }

    @Test(groups = {Groups.ACCEPTANCE_TEST})
    public void testMandatoryPieces() {

        System.setProperty("webdriver.chrome.driver", "C:\\workspace\\ucsd-ext-jira\\target\\test-classes\\drivers\\chrome\\chrome_win.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://ucsd-ext.atlassian.net");
        driver.manage().window().maximize();

        Assert.assertEquals("a", "a");

        driver.quit();

    }


}

