package com.example.pairtodo.payload;

public class RegisterResponse {
    private Long id;
    private Long accountId;
    private String username;
    private String phone;
    private String token;

    public RegisterResponse(Long id, Long accountId, String username, String phone, String token) {
        this.id = id;
        this.accountId = accountId;
        this.username = username;
        this.phone = phone;
        this.token = token;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public Long getAccountId() {
        return accountId;
    }

    public String getUsername() {
        return username;
    }

    public String getPhone() {
        return phone;
    }

    public String getToken() {
        return token;
    }
}
