package com.ucsd.jira.automation.data.enums;

public enum LeftMenu implements JiraMenu {

    CREATE("Create"),
    DASHBOARD("Dashboards"),
    PROJECTS("Projects"),
    ISSUES("Issues"),
    SEARCH("Search");

    String primaryMenu;

    LeftMenu(String menuItem) {
        this.primaryMenu = menuItem;
    }

    @Override
    public String getPrimaryMenu() {
        return primaryMenu;
    }

}
