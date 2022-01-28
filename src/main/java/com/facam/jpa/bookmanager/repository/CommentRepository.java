package com.facam.jpa.bookmanager.repository;

import com.facam.jpa.bookmanager.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
