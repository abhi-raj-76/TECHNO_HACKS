package com.example.techno.Library.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="library_book_info")

public class LibraryModel 
{
    @Id

    private String bookId;
    private String bookName;
    private String authorName;
    private String yearOfPub;
    private String edition;
    private String language;

    public LibraryModel() 
    {}

    public LibraryModel(String bookId, String bookName, String authorName, String yearOfPub, String edition,
        String language) 
    {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.yearOfPub = yearOfPub;
        this.edition = edition;
        this.language = language;
    }

    
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setYearOfPub(String yearOfPub) {
        this.yearOfPub = yearOfPub;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getYearOfPub() {
        return yearOfPub;
    }

    public String getEdition() {
        return edition;
    }

    public String getLanguage() {
        return language;
    }

}
