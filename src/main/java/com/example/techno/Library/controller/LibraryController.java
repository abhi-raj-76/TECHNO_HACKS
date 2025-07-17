package com.example.techno.Library.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.techno.Library.Model.LibraryModel;
import com.example.techno.Library.service.LibraryService;

@RestController
@RequestMapping("/librarymodel")

public class LibraryController 
{
    LibraryService libraryService;
    public LibraryController(LibraryService libraryService)
    {
        this.libraryService = libraryService;
    }

    @GetMapping("{bookId}")
    public LibraryModel getLibraryModelDetails(@PathVariable("bookId") String bookId)
    {
        return libraryService.getLibraryModel(bookId);
    }
    @GetMapping()
    public List<LibraryModel> getAllLibraryModelDetails()
    {
        return libraryService.getAllLibraryModel();
    }
    @PostMapping
    public String createLibraryModelDetails(@RequestBody LibraryModel libraryModel)
    {
        libraryService.createLibraryModel(libraryModel);
        return "book added successfully";
    }
    @PutMapping
    public String updateLibraryBookDetails(@RequestBody LibraryModel libraryModel)
    {
        libraryService.updateLibraryModel(libraryModel);
        return "book updated successfully";
    }
    @DeleteMapping("{bookId}")
    public String deleteLibraryBookDetails(@PathVariable("bookId") String bookId)
    {
        libraryService.deleteLibraryModel(bookId);
        return "book deleted successfully";
    }
}
