package com.learn.spring.monday.task276.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.spring.monday.task276.Model.Books;

public interface BooksRepository extends  JpaRepository<Books, Integer>{

}
