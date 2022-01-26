package com.facam.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class UserTest {
    @Test
    void test(){
        User user = new User();
        user.setEmail("haze@gmail.com");
        user.setName("haze");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

//        User user1 = new User(null,"haze", "haze@gmail.com", LocalDateTime.now(), LocalDateTime.now());
        User user2 = new User("haze","haze@gmail.com");

        User user3 = User.builder()
                .name("haze")
                .email("haze@gmail.com")
                .build();

        System.out.println(">>>>" + user.toString());
    }
}