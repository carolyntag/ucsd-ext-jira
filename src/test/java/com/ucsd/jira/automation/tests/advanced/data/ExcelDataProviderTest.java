package com.ucsd.jira.automation.tests.advanced.data;

import com.pwc.core.framework.annotations.MaxRetryCount;
import com.pwc.core.framework.listeners.Retry;
import com.ucsd.jira.automation.data.Constants;
import com.ucsd.jira.automation.data.provider.ExcelDataProvider;
import com.ucsd.jira.automation.frameworksupport.Groups;
import com.ucsd.jira.automation.frameworksupport.JiraTestCase;
import org.testng.annotations.Test;

import static com.pwc.logging.service.LoggerService.FEATURE;
import static com.pwc.logging.service.LoggerService.GIVEN;
import static com.pwc.logging.service.LoggerService.LOG;
import static com.pwc.logging.service.LoggerService.SCENARIO;
import static com.pwc.logging.service.LoggerService.THEN;
import static com.pwc.logging.service.LoggerService.WHEN;

public class ExcelDataProviderTest extends JiraTestCase {

    @Override
    public void beforeMethod() {
    }

    @Override
    public void afterMethod() {
    }

    @MaxRetryCount(1)
    @Test(enabled = false, retryAnalyzer = Retry.class, groups = {Groups.ACCEPTANCE_TEST}, dataProvider = "exampleExcelData", dataProviderClass = ExcelDataProvider.class)
    public void testExcelDataProvider(String firstName, String lastName, String nickName) {

        FEATURE("Feature Under Test");
        SCENARIO("Excel Sample Data Provider");
        GIVEN("I have done something");

        WHEN("I do something");
        webElementVisible(Constants.LOGO_HEADING);

        THEN("Something happens as expected");
        LOG(true, "First Name = %s", firstName);
        LOG(true, "Last Name = %s", lastName);
        LOG(true, "Nickname = %s", nickName);

    }

}
