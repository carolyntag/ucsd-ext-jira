package com.ucsd.jira.automation.frameworksupport;

import com.pwc.core.framework.command.WebServiceCommand;

import java.util.HashMap;
import java.util.List;

public abstract class WebServiceTestCase extends JiraTestCase {

    /**
     * Send a REST ws action to a service End Point
     *
     * @param command BaseGetCommand command type
     */
    protected Object webServiceAction(final WebServiceCommand command) {
        return super.webServiceAction(getCredentials(), command, null);
    }

    /**
     * Send a REST ws action to a service End Point
     *
     * @param command     BaseGetCommand command type
     * @param requestBody POST request body
     */
    protected Object webServiceAction(final WebServiceCommand command, final Object requestBody) {
        if (requestBody instanceof HashMap || requestBody instanceof List) {
            return super.webServiceAction(getCredentials(), command, null, requestBody);
        } else {
            return super.webServiceAction(getCredentials(), command, requestBody, null);
        }
    }

    /**
     * Send a REST ws action to a service End Point
     *
     * @param command      BaseGetCommand command type
     * @param parameterMap Name-Value pair filled map of parameters to send in HTTP request
     */
    protected Object webServiceAction(final WebServiceCommand command, final HashMap<String, Object> parameterMap) {
        return super.webServiceAction(getCredentials(), command, null, parameterMap);
    }

}
