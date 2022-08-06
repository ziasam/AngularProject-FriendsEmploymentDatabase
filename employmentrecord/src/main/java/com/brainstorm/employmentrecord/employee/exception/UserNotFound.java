package com.brainstorm.employmentrecord.employee.exception;

public class UserNotFound extends RuntimeException {
    public UserNotFound(String msg) {
        super(msg);
    }
}
