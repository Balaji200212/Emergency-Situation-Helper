package com.example.myapplication;

public class Users {
    String username, summary ,urlimagelink;

    Users(String username, String summary ,String urlimagelink) {
        this.username = username;
        this.summary = summary;
        this.urlimagelink=urlimagelink;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getUrlimagelink() {
        return urlimagelink;
    }

    public void setUrlimagelink(String urlimagelink) {
        this.urlimagelink = urlimagelink;
    }
}
