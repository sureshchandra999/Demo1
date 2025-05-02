package com.Suresh4.MyTikTakToe.exception;

public class DuplicateSymbolException extends RuntimeException{

    public DuplicateSymbolException() {

    }

    public DuplicateSymbolException(String message) {
        super(message);
    }

}
