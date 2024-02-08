package com.vivek.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vivek.Entity.Book;

public interface BookRepo  extends JpaRepository<Book, Integer>{

}
