package com.example.techno.Library.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class LibraryBookExceptionHandler 
{
    public ResponseEntity<Object> handleLibraryBookNotFoundException
    (LibraryBookNotFoundException libraryBookNotFoundException)
    {
        LibraryBookException libraryBookException = new LibraryBookException
        (libraryBookNotFoundException.getMessage(),libraryBookNotFoundException.getCause(),
        HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(libraryBookException,HttpStatus.NOT_FOUND);
    }
}
