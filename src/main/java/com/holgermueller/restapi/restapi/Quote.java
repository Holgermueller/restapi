package com.holgermueller.restapi.restapi;

public class Quote {

    private String id;
    private String theQuote;
    private String speaker;

    public Quote(String id, String theQuote, String speaker) {
        super();
        this.id = id;
        this.theQuote = theQuote;
        this.speaker = speaker;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

}
