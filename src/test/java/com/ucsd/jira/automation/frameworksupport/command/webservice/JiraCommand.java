package com.ucsd.jira.automation.frameworksupport.command.webservice;

import com.pwc.core.framework.FrameworkConstants;

public enum JiraCommand implements com.pwc.core.framework.command.WebServiceCommand {

    DELETE_ISSUE(FrameworkConstants.DELETE_REQUEST, "issue", ""), GET_SEARCH_BY_QUERY(FrameworkConstants.GET_REQUEST, "productsearch", "search"), GET_SEARCH(FrameworkConstants.GET_REQUEST, "search",
                    ""), GET_RECENT_SEARCH(FrameworkConstants.GET_REQUEST, "productsearch", "search?q=");

    private String requestMethodType;
    private String requestMapping;
    private String methodName;

    JiraCommand(String type, String mapping, String name) {
        requestMethodType = type;
        requestMapping = mapping;
        methodName = name;
    }

    @Override
    public String methodType() {
        return this.requestMethodType;
    }

    @Override
    public String mappingName() {
        return this.requestMapping;
    }

    @Override
    public String methodName() {
        return this.methodName;
    }

}
