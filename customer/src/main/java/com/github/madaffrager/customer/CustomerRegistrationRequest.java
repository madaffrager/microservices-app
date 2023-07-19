package com.github.madaffrager.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
