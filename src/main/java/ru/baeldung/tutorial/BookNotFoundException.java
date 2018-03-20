package ru.baeldung.tutorial;

public class BookNotFoundException extends RuntimeException{

    public BookNotFoundException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
