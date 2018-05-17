package com.ucsd.jira.automation.tests.web;

import com.pwc.core.framework.annotations.Issue;
import com.pwc.core.framework.listeners.Retry;
import com.ucsd.jira.automation.data.Constants;
import com.ucsd.jira.automation.data.enums.LeftMenu;
import com.ucsd.jira.automation.frameworksupport.Groups;
import com.ucsd.jira.automation.frameworksupport.TrackforceTestCase;
import org.testng.annotations.Test;

import static com.pwc.logging.service.LoggerService.FEATURE;
import static com.pwc.logging.service.LoggerService.GIVEN;
import static com.pwc.logging.service.LoggerService.SCENARIO;
import static com.pwc.logging.service.LoggerService.THEN;
import static com.pwc.logging.service.LoggerService.WHEN;


public class TrackforceBasicTest extends TrackforceTestCase {

    @Override
    public void beforeMethod() {
    }

    @Override
    public void afterMethod() {
    }

    @Issue("STORY-1234")
    @Test(retryAnalyzer = Retry.class, groups = {Groups.ACCEPTANCE_TEST})
    public void testTrackforceBasic() {

        FEATURE("Basic Trackforce Test");
        SCENARIO("User logs in and validates basic navigation functionality");

        GIVEN("I am a valid user");
        webAction("//a[contains(@href, 'support')]");

        WHEN("I navigate with the left menu");
        webElementTextExists("Trackforce Support is now online and real-time");

        THEN("The expected pages are displayed");

    }

}
