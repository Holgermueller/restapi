package com.holgermueller.restapi.restapi.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.holgermueller.restapi.restapi.Quote;

@RestController
public class QuoteController {
  @GetMapping("/api/quotes")
  public Object quotes() {

    ArrayList<Quote> quotes = new ArrayList<Quote>(
        Arrays.asList(
            new Quote(1, "Blah blh", "einstein"),
            new Quote(2, "foejioewjfew", " dhglshgs")));

    Random rand = new Random();
    Quote singleQuote = null;
    int index = rand.nextInt(quotes.size());
    singleQuote = quotes.get(index);

    return singleQuote;

    // ArrayList<String> quotes;
    // int currQuoteIndex;
    // public quoteBank() {
    // ArrayList<String> quotes = new ArrayList<>();
    // quotes.add("When you start to doubt yourself the real world will eat you
    // alive.");
    // quotes.add("Strength is the product of struggle, you must do what others
    // don't to achieve what others won't");
    // quotes.add("You need a little bit of insanity to do great things.");
    // quotes.add("No such thing as spare time, no such thing as free time, no such
    // thing as down time. All you got is life time. Go.");
    // quotes.add("Do not waste time with normal people. They are a plague and will
    // only slow you down.");
    // quotes.add("It's sad when someone you know becomes someone you knew.");
    // quotes.add("Being an artist is dragging your innermost feelings out, giving a
    // piece of yourself, no matter inwhich art form, in which medium.");
    // quotes.add("I believe that one defines oneself by reinventionn. To not be
    // like your parents. To not be like your friends. To be yourself. To cut
    // yourself out of stone.");
    // currQuoteIndex =0;
    // Collections.shuffle(quotes);
    // }
  }
}
