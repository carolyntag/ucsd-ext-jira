package com.ucsd.jira.automation.data.provider;

import org.testng.annotations.DataProvider;

public class IssueNumberProvider {

    @DataProvider(name = "knownIssueNumbers")
    public static Object[][] knownIssueNumbers() {
        return new Object[][]{
                {"UCSD1-75"},
                {"GRW-1"},
                {"OTP-5"}};
    }

}
