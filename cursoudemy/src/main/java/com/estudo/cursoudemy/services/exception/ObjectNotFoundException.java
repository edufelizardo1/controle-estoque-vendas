package com.estudo.cursoudemy.services.exception;

public class ObjectNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 3149600940123334641L;

    public ObjectNotFoundException(String msg) {
        super(msg);
    }

    public ObjectNotFoundException (String msg, Throwable cause) {
        super(msg, cause);
    }
}
