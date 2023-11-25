package com.bilgeadam.SpringKeyConcepts;

public class Book {

    private String name;
    private String author;
    private int pageCount;

    /**
     * This Book POJO(Plain Old Java Object) simulates the Book entity object
     * @param name
     * @param author
     * @param pageCount
     */
    public Book(String name, String author, int pageCount) {
        this.name = name;
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
