package dev.learning.sb;

import com.github.javafaker.Faker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SbK8sImplApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbK8sImplApplication.class, args);
    }

    @Bean
    public Faker faker() {
        return new Faker();
    }

}
