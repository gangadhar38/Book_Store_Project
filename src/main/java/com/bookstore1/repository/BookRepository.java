package com.bookstore1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bookstore1.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

}
