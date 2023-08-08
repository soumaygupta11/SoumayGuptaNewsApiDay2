package com.example.NewsApiDay2.entity;

public class ApiResponse {
    private final String message;
    private final int status;

    public ApiResponse(String message, int status) {
        this.message = message;
        this.status = status;
    }

    public String getMessage() { return message; }
    public int getStatus() { return status; }
}
