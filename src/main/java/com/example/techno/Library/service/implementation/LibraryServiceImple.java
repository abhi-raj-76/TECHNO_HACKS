package com.example.techno.Library.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.techno.Library.Model.LibraryModel;
import com.example.techno.Library.repository.LibraryRepository;
import com.example.techno.Library.service.LibraryService;

@Service

public class LibraryServiceImple implements LibraryService
{
    LibraryRepository libraryRepository;
    public LibraryServiceImple(LibraryRepository libraryRepository)
    {
        this.libraryRepository = libraryRepository;
    }

    @Override
    public String createLibraryModel(LibraryModel libraryModel) 
    {
        libraryRepository.save(libraryModel);
        return "success";
    }

    @Override
    public String updateLibraryModel(LibraryModel libraryModel) 
    {
        libraryRepository.save(libraryModel);
        return "success";
    }

    @Override
    public String deleteLibraryModel(String bookId) 
    {
        libraryRepository.deleteById(bookId);
        return "success";
    }

    @Override
    public LibraryModel getLibraryModel(String bookId) 
    {
        return libraryRepository.findById(bookId).get();
    }

    @Override
    public List<LibraryModel> getAllLibraryModel() 
    {
        return libraryRepository.findAll();
    }

}
