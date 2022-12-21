package com.example.spring_code.repositories;

import com.example.spring_code.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
