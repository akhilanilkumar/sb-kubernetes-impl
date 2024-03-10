package dev.learning.sb.service;

import com.github.javafaker.Faker;
import dev.learning.sb.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.IntStream;

@Service
public class UserService {

    private final Faker faker;

    public UserService(Faker faker) {
        this.faker = faker;
    }

    public List<User> getUsers() {
        return IntStream.range(1, 100)
                .parallel()
                .mapToObj(value -> User.builder()
                        .id(value)
                        .fullName(faker.name().fullName())
                        .username(faker.name().username())
                        .cellPhone(faker.phoneNumber().cellPhone())
                        .birthDate(faker.date().birthday())
                        .build()
                )
                .toList();
    }
}
