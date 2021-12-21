package com.java.hello.module23;

public class PerimeterException extends Exception{
    public PerimeterException() {
        super();
    }

    public PerimeterException(String message) {
        super(message);
    }

    public PerimeterException(String message, Throwable cause) {
        super(message, cause);
    }

    public PerimeterException(Throwable cause) {
        super(cause);
    }

    protected PerimeterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
