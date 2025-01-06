package com.suresh.EXCEPTION_ERROR.CustomException.CustomCheckedException;

public class CustomCheckedException extends Exception{

    public CustomCheckedException() {
        super();
    }

    public CustomCheckedException(String message) {
        super(message);
    }

    public CustomCheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomCheckedException(Throwable cause) {
        super(cause);
    }


}
