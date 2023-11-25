package com.bilgeadam.SpringKeyConcepts;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    ArrayList<Book> bookList;

    public BookService(){
        this.initializeBookService();
    }

    private void initializeBookService(){
        bookList = new ArrayList<>();

        Book book1 = new Book("Java", "James Gosling", 234);
        Book book2 = new Book("C#", "Bill Gates", 654);
        Book book3 = new Book("Harry Potter", "J.K.Rowling", 700);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
    }

    public List<Book> getAllBooks(){
        return bookList;
    }

    public Book addBook(Book book) throws NoSuchFieldException {

        if(book.getName() == null || book.getName().isEmpty()){
            throw new NoSuchFieldException("Book's name cannot be empty");
        }

        bookList.add(book);
        return book;
    }

}
