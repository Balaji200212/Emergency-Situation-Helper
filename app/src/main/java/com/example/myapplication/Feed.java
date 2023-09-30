package com.example.myapplication;

public class Feed {
    String username, text ,comments ,rating,radio;

    Feed(String username, String text ,String comments,String rating,String radio) {
        this.username= username;
        this.text= text;
        this.comments= comments;
        this.rating= rating;
        this.radio=radio;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username= username;
    }

    public String gettext() {
        return text;
    }

    public void settext(String text) {
        this.text= text;
    }
    public String getcomments() {
        return comments;
    }

    public void setcomments(String comments) {
        this.comments= comments;
    }
    public String getrating() {
        return rating;
    }

    public void setrating(String rating) {
        this.rating= rating;
    }
    public String getradio() {
        return radio;
    }

    public void setradio(String radio) {
        this.radio= radio;
    }
}