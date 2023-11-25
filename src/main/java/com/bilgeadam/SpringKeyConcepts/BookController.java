package com.bilgeadam.SpringKeyConcepts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    //Same with @Autowired
    private BookService bookService;

    public BookController(BookService bookService){
        this.bookService = new BookService();
    }

    @Autowired
    EventPublisherService eventPublisherService;

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBooks(){
        return ResponseEntity.ok().body(bookService.getAllBooks());
    }

    //Add book service
    @PostMapping("/book")
    public ResponseEntity<Book> addBook(@RequestBody BookRequest bookRequest) throws NoSuchFieldException {

        Book book = new Book(bookRequest.getName(), bookRequest.getAuthor(), bookRequest.getPageCount());
        eventPublisherService.publishBookCreatedEvent("Book is created successfully");
        return ResponseEntity.ok().body(bookService.addBook(book));
    }

}
