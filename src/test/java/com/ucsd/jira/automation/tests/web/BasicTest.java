package com.ucsd.jira.automation.tests.web;

import com.pwc.core.framework.annotations.Issue;
import com.pwc.core.framework.annotations.MaxRetryCount;
import com.pwc.core.framework.listeners.Retry;
import com.ucsd.jira.automation.data.Constants;
import com.ucsd.jira.automation.frameworksupport.Groups;
import com.ucsd.jira.automation.frameworksupport.JiraTestCase;
import org.testng.annotations.Test;

import static com.pwc.logging.service.LoggerService.*;

public class BasicTest extends JiraTestCase {

    @Override
    public void beforeMethod() {
    }

    @Override
    public void afterMethod() {
    }

    @Issue("STORY-777")
    @MaxRetryCount(1)
    @Test(retryAnalyzer = Retry.class, groups = {Groups.ACCEPTANCE_TEST})
    public void testBasic() {

        FEATURE("Basic Jira Test");
        SCENARIO("User logs in and validates basic functionality");

        GIVEN("I am a valid user");
        webElementVisible(Constants.LOGO_HEADING);

        WHEN("I do something");


        THEN("Something happens as expected");

    }

}
