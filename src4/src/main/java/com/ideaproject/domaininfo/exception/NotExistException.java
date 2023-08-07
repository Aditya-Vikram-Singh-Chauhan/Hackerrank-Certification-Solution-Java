package com.ideaproject.domaininfo.exception;

public class NotExistException  extends RuntimeException{

        private String message;

        public NotExistException() {}

        public NotExistException(String msg)
            {
                super(msg);
                this.message = msg;
            }
}
