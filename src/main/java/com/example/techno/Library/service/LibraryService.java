package com.example.techno.Library.service;

import java.util.List;

import com.example.techno.Library.Model.LibraryModel;

public interface LibraryService 
{
    public String createLibraryModel(LibraryModel libraryModel);
    public String updateLibraryModel(LibraryModel libraryModel);
    public String deleteLibraryModel(String bookId);
    public LibraryModel getLibraryModel(String bookId);
    public List<LibraryModel> getAllLibraryModel();    
}
