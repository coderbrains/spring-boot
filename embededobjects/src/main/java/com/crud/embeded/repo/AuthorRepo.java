package com.crud.embeded.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.embeded.entity.Author;

public interface AuthorRepo extends JpaRepository<Author, Integer>{

}
