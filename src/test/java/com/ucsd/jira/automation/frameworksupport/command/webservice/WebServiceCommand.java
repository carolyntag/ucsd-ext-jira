package com.ucsd.jira.automation.frameworksupport.command.webservice;

import com.pwc.core.framework.FrameworkConstants;

public enum WebServiceCommand implements com.pwc.core.framework.command.WebServiceCommand {

    GET_PRODUCT_SEARCH(FrameworkConstants.GET_REQUEST, "productsearch", "search?q=");

    private String requestMethodType;
    private String requestMapping;
    private String methodName;

    WebServiceCommand(String type, String mapping, String name) {
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
