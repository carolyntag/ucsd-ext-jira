package com.ucsd.jira.automation.data;

public final class Constants {

    // Application Defaults
    public static final byte[] SECURITY_KEY = {0x74, 0x68, 0x69, 0x73, 0x49, 0x73, 0x41, 0x53, 0x65, 0x63, 0x72, 0x65, 0x74, 0x4b, 0x65, 0x79};
    public static final int MAX_WEB_SERVICE_RESPONSE_TIME = 3000;

    // COMMON URLs
    public static final String HOME_URL = "/MyJiraHome.jspa";
    public static final String SW_URL = "https://www.southwest.com/";

    // HEADING Elements
    public static final String SW_HEADING = "//*[@id=\"TabbedArea_4-tab-0\"]/span/span/span[1]";

    public static final String LOGO_HEADING = "//h1[@id='logo']";
    public static final String TEST_HEADING = "//h1[contains(text(),'test')]";
    public static final String NEW_TEST_HEADING = "//*[@id=\"dashboard-content\"]/div[1]/div/div[1]/h1";

    public static final String DASHBOARD_HEADING = "/html/body/div[1]/div/div[1]/div/div/div[2]/div[1]/div[1]/div[2]/div/div/div[2]/div/div/div/div[2]/a";

    public static final String DASH2 = "//*[@id=\"jira\"]";

    // ANCHOR Elements
    public static final String FIRST_PROJECTS_ANCHOR = "//img[contains(@src, 'projectavatar')]/following-sibling::a";

    // SELECT Elements
    public static final String SELECT_CLASSIC = "/html/body/div[4]/div[2]/div[4]/div/div[2]/div/div/div[2]/div[1]/div[16]/div/div/button/span/span";
    public static final String ANOTHER_CLASSIC = "/html/body/div[3]/div[2]/div[4]/div/div[2]/div/div/div[2]/div[1]/div[16]/div/div/button/span/span";

    // INPUT Elements
    public static final String USERNAME_INPUT = "//input[@id='username']";
    public static final String PASSWORD_INPUT = "//input[@id='password']";
    public static final String BASIC_SEARCH_INPUT = "//input[@type='text' and @placeholder='Search']";
    public static final String FILTER_PROJECT_INPUT = "//input[@id='10566-project-filter-picker']";
    public static final String PROJECT_INPUT = "//*[@id='project-field']";
    public static final String ISSUE_TYPE_INPUT = "//*[@id='issuetype-field']";
    public static final String SUMMARY_INPUT = "//*[@id='summary']";
    public static final String REPORTER_INPUT = "//*[@id='reporter-field']";
    public static final String DESCRIPTION_INPUT = "//*[@id='description']";

    public static final String PROJECT_KEY = "/html/body/div[4]/div[2]/div[4]/div/div[2]/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/input";
    public static final String ANOTHER_KEY = "/html/body/div[3]/div[2]/div[4]/div/div[2]/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/input";
    public static final String SHORT_KEY = "//*[@id='project-create.create-form.advanced-dropdown.key-field.input']";

    public static final String SEARCH_BUBBLE_CHART = "/html/body/div[1]/div/div[2]/dashboard/div[1]/div/div[4]/div/div[2]/div/div/div/form/div[1]/div[1]/div/input";
    // BUTTON Elements
    public static final String ADVANCED_SEARCH_TEXTAREA = "advanced-search";
    public static final String SAVE_BUTTON = "//input[@type='submit' and @value='Save']";
    public static final String CREATE_BUTTON = "//*[@id='createGlobalItem']/span/span";
    public static final String CREATE_ISSUE_BUTTON = "//*[@id='create-issue-submit']";
    public static final String CREATE_PROJECT_BUTTON = "//*[@id='helpPanelContainer']/div/div/div[1]/header/nav/div[3]/div[2]/div/button";
    public static final String CREATE_NEW_PROJECT_BUTTON = "/html/body/div[4]/div[2]/div/span/div/div/div[2]/span/button/div/span/span";

    public static final String try_this_button = "//*[@id='jira']/div[4]/div[2]/div/span/div/div/div[2]/span/button/div/span/span";
    public static final String another_try_button = "/html/body/div[3]/div[2]/div/span/div/div/div[2]/span/button/div/span/span";


    public static final String ENTER_PROJECT_NAME = "//*[@id='project-create.create-form.name-field.input']";
    //*[@id="jira"]/div[4]/div[2]/div/span/div/div/div[2]/span/button/div/span/span

    public static final String CREATE_PROJECT_CREATE_BUTTON = "/html/body/div[4]/div[2]/div[4]/div/div[2]/div/div/div/div/div/div[5]/button/span/span";

    // HEADING Elements
    public static final String VARIABLE_BY_TEXT_HEADING = "//h1[text()='%s']";

    // SPAN Elements
    public static final String VARIABLE_BY_LABEL_SPAN = "//span[contains(@aria-label, '%s')]";
    public static final String VARIABLE_BY_TEXT_SPAN = "//span[text()='%s']";
    public static final String CONTINUE_SPAN = "Continue";
    public static final String LOGIN_SPAN = "Log in";
    public static final String CLOSE_MENU_EXPAND_SPAN = "//span[@aria-label='Close']";
    public static final String VIEW_ALL_MATCHING_ISSUES_SPAN = "//span[text()='View all matching issues']";

    // STATIC Text
    public static final String NO_RECORDS_FOUND_TEXT = "No records found, try new search criteria.";

    //DIV Elements
    public static final String VARIABLE_BY_TEXT_DIV = "//div[text()='%s']";
    public static final String ISSUES_SEARCH_PREVIEW_DIV = "//div[@aria-label='Issues']";
    public static final String BOARDS_SEARCH_PREVIEW_DIV = "//div[@aria-label='Boards']";
    public static final String PROJECTS_SEARCH_PREVIEW_DIV = "//div[@aria-label='Projects']";

    public static final String ISSUES_AND_FILTERS_DIV = "//*[@id='navigation-app']/div[1]/div[1]/div[1]/div[2]/div/div/div[2]/div/div/div/div[3]/a/div[2]/div";
   // public static final String DASHBOARD_DIV = "//*[@id=\"navigation-app\"]/div[1]/div[1]/div[1]/div[2]/div/div/div[2]/div/div/div/div[1]/a/div[2]/div";
    public static final String PROJECTS_DIV = "//*[@id=\"jira-frontend\"]/div[1]/div[1]/div[1]/div[2]/div/div/div[2]/div/div/div/div[2]/a/div[2]/div";

    public static final String DASHBOARD_DIV = "//*[@id='helpPanelContainer']/div/div/div[1]/header/nav/div[3]/div[4]/button/span/span[1]";
    private Constants() {
    }

}
