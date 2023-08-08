package com.example.NewsApiDay2.controller;

import com.example.NewsApiDay2.entity.ApiResponse;
import com.example.NewsApiDay2.entity.UserRequest;
import com.example.NewsApiDay2.service.NewsAPIService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsApiController {

    private final NewsAPIService newsApiService;

    public NewsApiController(NewsAPIService newsApiService) {
        this.newsApiService = newsApiService;
    }

    @PostMapping("/users")
    public ResponseEntity<ApiResponse> createUser(@RequestBody UserRequest userRequest) {
        ApiResponse response = newsApiService.createUser(userRequest);
        return ResponseEntity.status(response.getStatus()).body(response);
    }



}
