package com.bilgeadam.SpringKeyConcepts;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class BookCreatedEventListener {

    @EventListener
    public void onBookCreatedEvent(BookCreatedEvent evt){
        System.out.println("An event received - " + evt.getMessage());
    }
}
