package com.udacity.jdnd.course3.critter.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class ApiError {

    private HttpStatus httpStatus;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime timestamp;
    private String message;

    public ApiError(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
