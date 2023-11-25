package com.bilgeadam.SpringKeyConcepts;

import org.springframework.context.ApplicationEvent;

public class BookCreatedEvent extends ApplicationEvent {

    private String message;

    public BookCreatedEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
