package com.example.techno.Library.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class LibraryBookExceptionHandler 
{
    @ExceptionHandler(value = {LibraryBookNotFoundException.class})

    public ResponseEntity<Object> handleLibraryBookNotFoundException
    (LibraryBookNotFoundException libraryBookNotFoundException)
    {
        LibraryBookException libraryBookException = new LibraryBookException
        (libraryBookNotFoundException.getMessage(),libraryBookNotFoundException.getCause(),
        HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(libraryBookException,HttpStatus.NOT_FOUND);
    }
}
