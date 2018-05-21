package com.ucsd.jira.automation.tests.web.company.trackforce;

import com.pwc.core.framework.annotations.Issue;
import com.pwc.core.framework.listeners.Retry;
import com.ucsd.jira.automation.data.TrackforceConstants;
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

        FEATURE("Trackforce.com");
        SCENARIO("User logs in and validates basic navigation functionality");
        GIVEN("I am able to view the Trackforce website");

        WHEN("I select the Support tab");
        webAction(TrackforceConstants.SUPPORT_TAB_ANCHOR);

        THEN("The expected page is displayed");
        webElementTextExists(TrackforceConstants.TRACKFORCE_SUPPORT_TEXT);

    }

}
