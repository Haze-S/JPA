package com.facam.jpa.bookmanager.domain.listener;


import com.facam.jpa.bookmanager.domain.User;
import com.facam.jpa.bookmanager.domain.UserHistory;
import com.facam.jpa.bookmanager.repository.UserHistoryRepository;
import com.facam.jpa.bookmanager.surport.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

public class UserEntityListener {
    @PrePersist
    @PreUpdate
    public void prePersistAndUpdate(Object o) {
        UserHistoryRepository userHistoryRepository = BeanUtils.getBean(UserHistoryRepository.class);

        User user = (User) o;

        UserHistory userHistory = new UserHistory();
        userHistory.setUserId(user.getId());
        userHistory.setName(user.getName());
        userHistory.setEmail(user.getEmail());

        userHistoryRepository.save(userHistory);
    }
}
