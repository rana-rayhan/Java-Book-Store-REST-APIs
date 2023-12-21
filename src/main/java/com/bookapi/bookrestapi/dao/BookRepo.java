package com.bookapi.bookrestapi.dao;

import org.springframework.data.repository.CrudRepository;
import com.bookapi.bookrestapi.model.BookModel;

public interface BookRepo extends CrudRepository<BookModel, Integer> {
    public BookModel findById(int id);
}
