package com.example.spring_code.repositories;

import com.example.spring_code.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
