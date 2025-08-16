package com.tub.bookstore.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tub.bookstore.resources.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, String> {
}
