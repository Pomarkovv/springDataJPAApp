package com.example.spring_hibernate.repositories;

import com.example.spring_hibernate.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {
    List<Book> getBookByNameStartsWith(String name);
}
