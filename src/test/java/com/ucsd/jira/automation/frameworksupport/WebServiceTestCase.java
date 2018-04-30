package com.ucsd.jira.automation.frameworksupport;

import com.jayway.restassured.path.json.JsonPath;
import com.pwc.core.framework.FrameworkConstants;
import com.pwc.core.framework.command.WebServiceCommand;
import com.ucsd.jira.automation.data.Field;
import com.ucsd.jira.automation.frameworksupport.command.webservice.JiraCommand;
import com.ucsd.jira.automation.frameworksupport.type.JiraIssue;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
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

    /**
     * Find a Jira issue by it's issue number from the web service
     *
     * @param expectedIssueNumber issue number to find
     * @return JiraIssue object
     */
    protected JiraIssue findIssue(final String expectedIssueNumber) {

        JiraIssue issue = new JiraIssue();
        List<ArrayList> recentIssuesList = new ArrayList<>();
        List<HashMap> recentIssueList = new ArrayList<>();

        JsonPath response = (JsonPath) webServiceAction(JiraCommand.GET_RECENT_SEARCH);
        JsonPath entity = new JsonPath(response.get(FrameworkConstants.HTTP_ENTITY_KEY).toString());
        List<HashMap> quickSearchIssueList = entity.get();
        for (HashMap hashMap : quickSearchIssueList) {
            if (StringUtils.equalsIgnoreCase(hashMap.get("name").toString(), "recent issues")) {
                recentIssuesList = entity.get("items");
                break;
            }
        }

        recentIssuesList.forEach(eachItem -> {
            if (!eachItem.isEmpty()) {
                recentIssueList.addAll(eachItem);
            }
        });

        for (HashMap recentIssue : recentIssueList) {
            if (StringUtils.equalsIgnoreCase(recentIssue.get("metadata").toString(), expectedIssueNumber) &&
                    StringUtils.containsIgnoreCase(recentIssue.get("avatarUrl").toString(), "story.svg")) {
                issue.setMetadata(recentIssue.get("metadata").toString());
                issue.setAvatarUrl(recentIssue.get("avatarUrl").toString());
                issue.setSubTitle(recentIssue.get("subtitle").toString());
                issue.setTitle(recentIssue.get(Field.TITLE).toString());
                issue.setFavoirite(Boolean.valueOf(recentIssue.get("favourite").toString()));
                issue.setUrl(recentIssue.get("url").toString());
                break;
            }
        }

        return issue;
    }

    /**
     * Get a random recent issue
     *
     * @return random Jira issue found
     */
    protected JiraIssue getIssue() {

        JiraIssue randomIssue = new JiraIssue();
        JsonPath response = (JsonPath) webServiceAction(JiraCommand.GET_RECENT_SEARCH);
        JsonPath entity = new JsonPath(response.get(FrameworkConstants.HTTP_ENTITY_KEY).toString());
        List<HashMap> searchTypeList = entity.get();
        for (HashMap searchType : searchTypeList) {
            if (StringUtils.equalsIgnoreCase(searchType.get("name").toString(), "recent issues")) {
                List recentItems = (List) searchType.get("items");
                int index = getRandomIndexFromList(recentItems);
                HashMap issue = (HashMap) recentItems.get(index);
                randomIssue.setUrl(issue.get("url").toString());
                randomIssue.setFavoirite(Boolean.valueOf(issue.get("favourite").toString()));
                randomIssue.setTitle(issue.get("title").toString());
                randomIssue.setSubTitle(issue.get("subtitle").toString());
                randomIssue.setMetadata(issue.get("metadata").toString());
                randomIssue.setAvatarUrl(issue.get("avatarUrl").toString());
            }
        }
        return randomIssue;
    }

}
