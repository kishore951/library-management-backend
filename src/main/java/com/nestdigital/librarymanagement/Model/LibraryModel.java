package com.nestdigital.librarymanagement.Model;

import jdk.jfr.Name;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "library")
public class LibraryModel {

    @Id
    @GeneratedValue
    private int id;
    private String bookTitle;
    private String description;
    private String author;

    public LibraryModel() {
    }

    public LibraryModel(int id, String bookTitle, String description, String author) {
        this.id = id;
        this.bookTitle = bookTitle;
        this.description = description;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
