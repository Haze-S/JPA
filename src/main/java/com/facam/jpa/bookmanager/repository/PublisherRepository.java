package com.facam.jpa.bookmanager.repository;

import com.facam.jpa.bookmanager.domain.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
