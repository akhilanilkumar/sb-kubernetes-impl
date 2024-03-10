package dev.learning.sb.model;

import lombok.Builder;

import java.util.Date;

@Builder
public record User(int id, String username, String fullName, String cellPhone, Date birthDate) {
}
