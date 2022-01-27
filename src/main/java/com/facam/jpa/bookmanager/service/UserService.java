package com.facam.jpa.bookmanager.service;

import com.facam.jpa.bookmanager.domain.User;
import com.facam.jpa.bookmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Service
public class UserService {
    @Autowired
    private EntityManager entityManager;
    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void put() {
        User user = new User();
        user.setName("haze");
        user.setEmail("haze@amail.com");

        entityManager.persist(user);
//        entityManager.detach(user);

        user.setName("hazeAfterPersist");
        entityManager.merge(user);
//        entityManager.flush();
//        entityManager.clear();

        User user2 = userRepository.findById(1L).get();
        entityManager.remove(user2);

        user2.setName("haaaaze");
        entityManager.merge(user2);
    }
}
