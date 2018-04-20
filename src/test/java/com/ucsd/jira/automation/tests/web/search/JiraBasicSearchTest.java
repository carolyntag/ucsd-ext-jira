package com.ucsd.jira.automation.tests.web.search;

import com.pwc.core.framework.annotations.Issue;
import com.pwc.core.framework.listeners.Retry;
import com.ucsd.jira.automation.data.Constants;
import com.ucsd.jira.automation.data.Data;
import com.ucsd.jira.automation.data.enums.LeftMenu;
import com.ucsd.jira.automation.frameworksupport.Groups;
import com.ucsd.jira.automation.frameworksupport.JiraTestCase;
import org.testng.annotations.Test;

import static com.pwc.logging.service.LoggerService.FEATURE;
import static com.pwc.logging.service.LoggerService.GIVEN;
import static com.pwc.logging.service.LoggerService.SCENARIO;
import static com.pwc.logging.service.LoggerService.THEN;
import static com.pwc.logging.service.LoggerService.WHEN;

public class JiraBasicSearchTest extends JiraTestCase {

    @Override
    public void beforeMethod() {
    }

    @Override
    public void afterMethod() {
    }

    @Issue("STORY-123")
    @Test(retryAnalyzer = Retry.class, groups = {Groups.ACCEPTANCE_TEST})
    public void testJiraBasicSearch() {

        FEATURE("Search Functionality");
        SCENARIO("Basic Jira search capabilities");

        GIVEN("I am on the Jira landing page");
        webElementVisible(Constants.TEST_HEADING);

        WHEN("I perform a basic JIRA search");
        webAction(LeftMenu.SEARCH);
        webAction(Constants.BASIC_SEARCH_INPUT, Data.DEFAULT_SEARCH_TEXT);

        THEN("The expected search results are viewable");
        webElementVisible(Constants.ISSUES_SEARCH_PREVIEW_DIV);
        webElementTextContains(Constants.ISSUES_SEARCH_PREVIEW_DIV, Data.DEFAULT_SEARCH_TEXT);
        webElementTextContains(Constants.BOARDS_SEARCH_PREVIEW_DIV, Data.DEFAULT_SEARCH_TEXT);
        webElementTextContains(Constants.PROJECTS_SEARCH_PREVIEW_DIV, Data.DEFAULT_SEARCH_TEXT);

        webAction(Constants.VIEW_ALL_MATCHING_ISSUES_SPAN);
        webElementTextEquals(Constants.ADVANCED_SEARCH_TEXTAREA, "summary ~ \"UCSD*\" OR description ~ \"UCSD*\" ORDER BY lastViewed DESC");

    }

}
