package com.example.techno.Library.Exception;

public class LibraryBookNotFoundException extends RuntimeException
{
    public LibraryBookNotFoundException(String message)
    {super(message);}
    public LibraryBookNotFoundException(String message,Throwable cause)
    {super(message,cause);}
}
