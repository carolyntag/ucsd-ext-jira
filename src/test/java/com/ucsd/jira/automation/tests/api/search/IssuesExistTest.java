package com.ucsd.jira.automation.tests.api.search;

import com.pwc.core.framework.annotations.Issue;
import com.pwc.core.framework.listeners.Retry;
import com.ucsd.jira.automation.data.provider.IssueNumberProvider;
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

public class IssuesExistTest extends WebServiceTestCase {

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
    @Test(retryAnalyzer = Retry.class, groups = {Groups.ACCEPTANCE_TEST}, dataProvider = "knownIssueNumbers", dataProviderClass = IssueNumberProvider.class)
    public void testIssuesExist(String issueNumber) {

        FEATURE("Issue Web Services");
        SCENARIO("Search for all known Jira issue numbers");
        GIVEN("I have a known issue number=%s to search for", issueNumber);

        WHEN("I search for a Jira issue number");
        JiraIssue jiraIssue = findIssue(issueNumber);

        THEN("The correct Jira issue was found or created");
        assertEquals("Verify Issue Number", jiraIssue.getMetadata(), issueNumber);

    }

}
