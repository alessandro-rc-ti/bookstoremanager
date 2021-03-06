package com.alessandro.bookstoremanager.users.builder;

import com.alessandro.bookstoremanager.users.dto.JwtRequest;

import lombok.Builder;

@Builder
public class JwtRequestBuilder {

    @Builder.Default
    private String username = "rodrigo";

    @Builder.Default
    private String password = "123456";

    public JwtRequest builJwtRequest() {
        return new JwtRequest(username, password);
    }
}
