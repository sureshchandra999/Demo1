package com.suresh.EXCEPTION_ERROR.CustomException.Custom_UnChecked_Exception;

public class CustomUncheckedException extends RuntimeException{
    public CustomUncheckedException() {
        super();
    }

    public CustomUncheckedException(String message) {
        super(message);
    }

    public CustomUncheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomUncheckedException(Throwable cause) {
        super(cause);
    }
}
