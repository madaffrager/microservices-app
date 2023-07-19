package com.github.madaffrager;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
