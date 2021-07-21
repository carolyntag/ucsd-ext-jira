package com.ucsd.jira.automation.tests.web.company.jira;

import com.pwc.core.framework.annotations.Issue;
import com.pwc.core.framework.listeners.Retry;
import com.strobel.core.StringUtilities;
import com.ucsd.jira.automation.data.Constants;
import com.ucsd.jira.automation.frameworksupport.Groups;
import com.ucsd.jira.automation.frameworksupport.JiraTestCase;
import org.apache.commons.lang.RandomStringUtils;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.Random;

import static com.pwc.logging.service.LoggerService.*;


public class CreateStoryTest extends JiraTestCase {

    @Override
    public void beforeMethod() {
    }

    @Override
    public void afterMethod() {
    }

    @Issue("STORY-1234")
    @Test(retryAnalyzer = Retry.class, groups = {Groups.ACCEPTANCE_TEST})
    public void testCreateStory() {

        FEATURE("Create Story Test sneak developer");
        SCENARIO("User logs in and validates create story functionality");

        GIVEN("I am a valid user");
        webElementVisible(Constants.NEW_TEST_HEADING);
//        String rankey = RandomStringUtils.random(3,String.valueOf(System.currentTimeMillis()));
//        String sprojName = "CarolynsNewProject_" + rankey;
//        WHEN("I create a project");
//        webAction(Constants.CREATE_PROJECT_BUTTON, "Create project");
//        webAction(Constants.another_try_button);
//        webAction(Constants.ANOTHER_CLASSIC);
//        webAction(Constants.ENTER_PROJECT_NAME,sprojName);
//     //   webEventController.getWebEventService().findWebElement("//*[@id=\"jira\"]/div[4]/div[2]/div/span/div/div/div[2]/span/button/div/span/span").click();
//
//        String sKey = getWebElementText(Constants.SHORT_KEY);
//        redirect(Constants.HOME_URL);

        WHEN("I create a story");
        webAction(Constants.CREATE_BUTTON);
        webElementExists(Constants.PROJECT_INPUT);
        webAction(Constants.PROJECT_INPUT,"AOP");
      // redirect(Constants.HOME_URL);

        THEN("Fill out the story");
     //   webAction(Constants.SUMMARY_INPUT,"This is a " + sprojName + " story");
        webAction(Constants.CREATE_ISSUE_BUTTON);


        redirect(Constants.HOME_URL);

    }

}
