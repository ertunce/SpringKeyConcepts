package com.bilgeadam.SpringKeyConcepts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class EventPublisherService {

    @Autowired
    private ApplicationEventPublisher publisher;

    public void publishBookCreatedEvent(String message){
        BookCreatedEvent event = new BookCreatedEvent(this,message);
        publisher.publishEvent(event);
    }
}
