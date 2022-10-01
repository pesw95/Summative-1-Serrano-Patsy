package com.company.Summative1SerranoPatsy.controller;

import com.company.Summative1SerranoPatsy.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class QuoteController {
   private List<Quote> quoteList;
   private static int idCounter = 1;

   public QuoteController (){
       quoteList = new ArrayList<>();

       quoteList.add(new Quote( "Patsy Serrano", "Love everyone, but specifically love yourself first!", idCounter ++));
       quoteList.add(new Quote( "Vanessa Serrano", "Love and live life to the fullest", idCounter++));
       quoteList.add(new Quote(" R. Oliver", "Practice makes perfect!",idCounter++));
       quoteList.add(new Quote( "Shakiya Friend", "Live life bodly", idCounter ++));
       quoteList.add(new Quote( "Justin Didly", " The ability is what you are capable of!", idCounter++));
       quoteList.add(new Quote(" Ryan W.", "Keep tyring harder and never give up.",idCounter++));
       quoteList.add(new Quote( "Maria Bracamontes", "Never give up hope and always keep moving foward.", idCounter ++));
       quoteList.add(new Quote( "Racmel Serrano", "Help yourself first before you are capable of helping someone else. ", idCounter++));
       quoteList.add(new Quote(" Jesus Christ", "You are forgiven!",idCounter++));
       quoteList.add(new Quote("Someone", "Forgive and forget.", idCounter++));

   }

   @RequestMapping(value = "/quote", method = RequestMethod.GET)
   @ResponseStatus(value = HttpStatus.OK)
    public Quote getQuoteByRandom() {
//     Instantiating the Quote class
        Quote getQuote = new Quote();

//     Randomizing the quote of the Day
        Collections.shuffle(quoteList);

//     For loop to return a quote from list
        for(Quote quote : quoteList) {
            if (quote.getId() != idCounter ){
                getQuote = quote;
            }
        }

        return getQuote ;
    }


}
