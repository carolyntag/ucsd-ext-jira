package com.ucsd.jira.automation.data.provider;

import com.ucsd.jira.automation.frameworksupport.WebServiceTestCase;
import org.testng.annotations.DataProvider;

public abstract class IssueNumberProvider extends WebServiceTestCase {

    @DataProvider(name = "knownIssueNumbers")
    public static Object[][] knownIssueNumbers() {
        return new Object[][]{
                {"UCSD1-1"},
                {"TES-1"}};
    }

}
