package com.holgermueller.restapi.restapi.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.holgermueller.restapi.restapi.Quote;

@RestController
public class QuoteController {
  @RequestMapping("/api/quotes")
  public Quote quotes() {

    List<Quote> quotes = new ArrayList<Quote>(
        Arrays.asList(
            new Quote("When you start to doubt yourself the real world will eat you alive.", "Henry Rollins"),
            new Quote(
                "Strength is the product of struggle, you must do what others don't to achieve what others won't",
                "Henry Rollins"),
            new Quote("You need a little bit of insanity to do great things.", "Henry Rollins"),
            new Quote(
                "No such thing as spare time, no such thing as free time, no such thing as down time. All you got is life time. Go.",
                "Henry Rollins"),
            new Quote("Do not waste time with normal people. They are a plague and will only slow you down.",
                "Henry Rollins"),
            new Quote("It's sad when someone you know becomes someone you knew.", "Henry Rollins"),
            new Quote(
                "Being an artist is dragging your innermost feelings out, giving a piece of yourself, no matter inwhich art form, in which medium.",
                "Henry Rollins"),
            new Quote(
                "I believe that one defines oneself by reinventionn. To not be like your parents. To not be like your friends. To be yourself. To cut yourself out of stone.",
                "Henry Rollins")));

    Random rand = new Random();
    Quote singleQuote = null;
    int index = rand.nextInt(quotes.size());
    singleQuote = quotes.get(index);

    return singleQuote;

  }
}
