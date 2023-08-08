package com.example.NewsApiDay2.entity;

public class UserRequest {
    private String email;
    private String selectedCategory;
    private String selectedCountry;

    public UserRequest(String email, String selectedCategory, String selectedCountry) {
        this.email = email;
        this.selectedCategory = selectedCategory;
        this.selectedCountry = selectedCountry;
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
