package com.example.NewsApiDay2.service;

import com.example.NewsApiDay2.entity.ApiResponse;
import com.example.NewsApiDay2.entity.User;
import com.example.NewsApiDay2.entity.UserRequest;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


@Service
public class NewsAPIService {
    private final Map<Long, User> userMap = new HashMap<>();
    private final AtomicInteger userIdCounter = new AtomicInteger(1);

    public ApiResponse createUser(UserRequest userRequest) {
        String email = userRequest.getEmail();
        String selectedCategory = userRequest.getSelectedCategory();
        String selectedCountry = userRequest.getSelectedCountry();

        if (email == null || selectedCategory == null || selectedCountry == null) {
            return new ApiResponse("Incomplete data", 400);
        }

        if (!isValidEmail(email)) {
            return new ApiResponse("Invalid email format", 400);
        }

        long userId = userIdCounter.getAndIncrement();
        User newUser = new User(email, selectedCategory, selectedCountry);
        userMap.put(userId, newUser);

        return new ApiResponse("User created successfully", 201);
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[\\w\\.-]+@[\\w\\.-]+\\.[\\w]+$";
        return email.matches(emailRegex);
    }
}
