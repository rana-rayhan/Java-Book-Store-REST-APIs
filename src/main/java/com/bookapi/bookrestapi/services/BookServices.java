package com.bookapi.bookrestapi.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.bookapi.bookrestapi.dao.BookRepo;
import com.bookapi.bookrestapi.model.BookModel;

@Component
public class BookServices {
    @Autowired
    private BookRepo bookRepo;

    public List<BookModel> getAllBook() {
        List<BookModel> list = (List<BookModel>) this.bookRepo.findAll();

        return list;
    }

    public BookModel getSingleBook(int id) {
        BookModel book = null;
        try {
            book = bookRepo.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return book;
    }

    public BookModel addBook(BookModel b) {
        BookModel book = bookRepo.save(b);
        return book;
    }

    public void deleteBook(int id) {
        bookRepo.deleteById(id);
    }

    public void updateBook(BookModel book, int id) {
        book.setId(id);
        bookRepo.save(book);
    }

}
