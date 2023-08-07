package com.ideaproject.domaininfo.exception;

public class AlreadyExistException extends RuntimeException{
    private String message;
    public AlreadyExistException() {}

    public AlreadyExistException(String msg)
    {
        super(msg);
        this.message = msg;
    }
}
