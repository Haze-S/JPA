package com.facam.jpa.bookmanager.service;

import com.facam.jpa.bookmanager.domain.Author;
import com.facam.jpa.bookmanager.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AuthorService {
    private final AuthorRepository authorRepository;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void putAuthor() {
        Author author = new Author();
        author.setName("haze");

        authorRepository.save(author);

        throw new RuntimeException("오류가 발생하면 transaction은 어떻게 되나");
    }
}
