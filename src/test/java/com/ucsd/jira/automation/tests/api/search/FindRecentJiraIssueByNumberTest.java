package com.ucsd.jira.automation.tests.api.search;

import com.pwc.core.framework.annotations.Issue;
import com.pwc.core.framework.listeners.Retry;
import com.ucsd.jira.automation.frameworksupport.Groups;
import com.ucsd.jira.automation.frameworksupport.WebServiceTestCase;
import com.ucsd.jira.automation.frameworksupport.type.JiraIssue;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.pwc.assertion.AssertService.assertEquals;
import static com.pwc.logging.service.LoggerService.FEATURE;
import static com.pwc.logging.service.LoggerService.GIVEN;
import static com.pwc.logging.service.LoggerService.SCENARIO;
import static com.pwc.logging.service.LoggerService.THEN;
import static com.pwc.logging.service.LoggerService.WHEN;

public class FindRecentJiraIssueByNumberTest extends WebServiceTestCase {

    @BeforeTest(alwaysRun = true)
    public void beforeTest() {
        setHeadlessMode(true);
    }

    @Override
    public void beforeMethod() {
    }

    @Override
    public void afterMethod() {
    }

    @Issue("STORY-1234")
    @Test(retryAnalyzer = Retry.class, groups = {Groups.ACCEPTANCE_TEST})
    public void testFindRecentJiraIssueByNumber() {

        FEATURE("Issue Web Services");
        SCENARIO("Search for a recent issue by it's issue number");

        GIVEN("I have an issue number to search for");
        JiraIssue randomIssue = getIssue();

        WHEN("I search for a Jira issue number");
        JiraIssue foundJiraIssue = findIssue(randomIssue.getMetadata());

        THEN("The correct Jira issue was found or created");
        assertEquals("Verify Issue Number", foundJiraIssue.getMetadata(), randomIssue.getMetadata());

    }

}
