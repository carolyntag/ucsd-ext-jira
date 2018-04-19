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
        webElementVisible(Constants.TEST_HEADING);
        webElementExists(Constants.PROJECT_FILTER_INPUT);
  //      webAction(Constants.PROJECT_FILTER_INPUT,Constants.TEST);

        WHEN("I do something");
        webElementExists(Constants.CREATE_SPAN);
        webAction(Constants.CREATE_SPAN);

        THEN("Something happens as expected");
        webElementExists(Constants.SUMMARY_TEXTAREA);
    //    webAction(Constants.SUMMARY_TEXTAREA, Constants.SUMMARY_TEXTAREA);

        webElementExists(Constants.SUMMARY_INPUT);
    //    webAction(Constants.SUMMARY_INPUT);

        webAction(Constants.CANCEL_BUTTON);

        webElementExists(Constants.SEARCH_INPUT);
            webAction(Constants.SEARCH_INPUT);

            webElementExists(Constants.SEARCH_PICKER_INPUT);
         //   webAction(Constants.SEARCH_PICKER_INPUT, Constants.TEST);

    }

}
