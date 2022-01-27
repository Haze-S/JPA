package com.facam.jpa.bookmanager.service;

import com.facam.jpa.bookmanager.domain.Author;
import com.facam.jpa.bookmanager.domain.Book;
import com.facam.jpa.bookmanager.repository.AuthorRepository;
import com.facam.jpa.bookmanager.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    @Transactional
    public void putBookAndAuthor() {
        Book book = new Book();
        book.setName("JPA 시작하기");

        bookRepository.save(book);

        Author author = new Author();
        author.setName("martin");

        authorRepository.save(author);

        throw new RuntimeException("오류가 나서 DB commit이 발생하지 않습니다.");
    }
}
