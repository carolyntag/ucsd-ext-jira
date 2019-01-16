package com.ucsd.jira.automation.data.enums;

public enum LeftMenu implements JiraMenu {

    DASHBOARDS("Dashboards"),
    PROJECTS("Projects"),
    ISSUES("Issues and filters"),
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
