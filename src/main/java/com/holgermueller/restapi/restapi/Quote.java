package com.holgermueller.restapi.restapi;

public class Quote {
    private String theQuote;
    private String speaker;

    public Quote() {
    }

    public Quote(String theQuote, String speaker) {
        this.theQuote = theQuote;
        this.speaker = speaker;
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
        return theQuote + speaker;
    }

}
