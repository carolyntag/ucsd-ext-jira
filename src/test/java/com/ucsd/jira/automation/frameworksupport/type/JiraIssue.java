package com.ucsd.jira.automation.frameworksupport.type;

public class JiraIssue {

    private String metadata;
    private String avatarUrl;
    private String subTitle;
    private String title;
    private boolean favoirite;
    private String url;

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isFavoirite() {
        return favoirite;
    }

    public void setFavoirite(boolean favoirite) {
        this.favoirite = favoirite;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
