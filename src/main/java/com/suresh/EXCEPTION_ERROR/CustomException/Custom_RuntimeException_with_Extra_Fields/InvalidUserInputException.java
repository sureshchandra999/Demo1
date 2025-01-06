package com.suresh.EXCEPTION_ERROR.CustomException.Custom_RuntimeException_with_Extra_Fields;

public class InvalidUserInputException extends RuntimeException{
    private String field;
    private String reason;

    public InvalidUserInputException(String field, String reason) {
        super(String.format("Invalid input in field '%s': %s", field, reason));
        this.field = field;
        this.reason = reason;
    }

    public InvalidUserInputException(String field, String reason, Throwable cause) {
        super(String.format("Invalid input in field '%s': %s", field, reason), cause);
        this.field = field;
        this.reason = reason;
    }

    public String getField() {
        return field;
    }

    public String getReason() {
        return reason;
    }

}
