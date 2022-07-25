package com.holgermueller.restapi.restapi;

public class Quote {

    private int id;
    private String theQuote;
    private String speaker;

    public Quote() {

    }

    public Quote(int id, String theQuote, String speaker) {
        this.id = id;
        this.theQuote = theQuote;
        this.speaker = speaker;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTheQuote() {
        return theQuote;
    }

    public void setTheQuote(String theQuote) {
        this.theQuote = theQuote;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    @Override
    public String toString() {
        return id + theQuote + speaker;
    }

}
