package com.example.NewsApiDay2.entity;

public class User {

    private Long userId;
    private String email;
    private String selectedCategory;
    private String selectedCountry;

    public User(String email, String selectedCategory, String selectedCountry) {
        this.userId = userId;
        this.email = email;
        this.selectedCategory = selectedCategory;
        this.selectedCountry = selectedCountry;
    }

    public Long getUserId() {
        return userId;
    }
    public String getEmail() {
        return email;
    }

    public String getSelectedCategory() {
        return selectedCategory;
    }

    public String getSelectedCountry() {
        return selectedCountry;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setSelectedCategory(String selectedCategory) {
        this.selectedCategory = selectedCategory;
    }

    public void setSelectedCountry(String selectedCountry) {
        this.selectedCountry = selectedCountry;
    }
}