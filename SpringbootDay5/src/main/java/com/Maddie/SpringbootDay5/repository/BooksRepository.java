package com.Maddie.SpringbootDay5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Maddie.SpringbootDay5.modelEntity.Books;

public interface BooksRepository extends JpaRepository<Books, Integer>
{

}
