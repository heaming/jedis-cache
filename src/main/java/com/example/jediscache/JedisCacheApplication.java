package com.example.jediscache;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class JedisCacheApplication implements ApplicationRunner {

    private final UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(JedisCacheApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        userRepository.save(
                User.builder()
                        .name("user1")
                        .email("user1@test.com")
                        .build()
        );
        userRepository.save(
                User.builder()
                        .name("user2")
                        .email("user2@test.com")
                        .build()
        );
        userRepository.save(
                User.builder()
                        .name("user3")
                        .email("user3@test.com")
                        .build()
        );
        userRepository.save(
                User.builder()
                        .name("user4")
                        .email("user4@test.com")
                        .build()
        );
    }
}
