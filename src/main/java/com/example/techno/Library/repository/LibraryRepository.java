package com.example.techno.Library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.techno.Library.Model.LibraryModel;

public interface LibraryRepository extends JpaRepository<LibraryModel, String>
{}
