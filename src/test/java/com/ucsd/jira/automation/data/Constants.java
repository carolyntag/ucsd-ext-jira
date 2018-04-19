package com.ucsd.jira.automation.data;

public final class Constants {

    private Constants() {
    }

    // Application Defaults
    public static final byte[] SECURITY_KEY = {0x74, 0x68, 0x69, 0x73, 0x49, 0x73, 0x41, 0x53, 0x65, 0x63, 0x72, 0x65, 0x74, 0x4b, 0x65, 0x79};
    public static final int MAX_WEB_SERVICE_RESPONSE_TIME = 3000;

    // HEADING Elements
    public static final String LOGO_HEADING = "//h1[@id='logo']";
    public static final String TEST_HEADING = "//h1[contains(text(),'test')]";


    // INPUT Elements
    public static final String USERNAME_INPUT = "//input[@id='username']";
    public static final String PASSWORD_INPUT = "//input[@id='password']";
    public static final String SUMMARY_INPUT = "//div[2]//div[1]//div//form//div[1]//div[2]//div[1]//label//span";
    public static final String TEST = "Project Steve";
    public static final String SEARCH_INPUT = "//input[@class='bjMcDu']";
    public static final String SUMMARY_TEXTAREA = "//textarea[@id='description' and @data-project-key='TEST']";
    public static final String PROJECT_FILTER_INPUT ="//input[@id='10566-project-filter-picker']";




    // SPAN Elements
    public static final String CONTINUE_SPAN = "Continue";
    public static final String LOGIN_SPAN = "Log in";
    public static final String CREATE_SPAN = "//span[@aria-label='Create']";
    public static final String SEARCH_SPAN = "//span[@aria-label='Search (/)']";

    // STATIC Text
    public static final String NO_RECORDS_FOUND_TEXT = "No records found, try new search criteria.";

    //DIALOG Elements
    public static final String CREATE_ISSUE_DIALOG = "//div[@id='create-issue-dialog";


}
