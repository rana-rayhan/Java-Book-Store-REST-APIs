package com.bookapi.bookrestapi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.bookapi.bookrestapi.model.BookModel;
import com.bookapi.bookrestapi.services.BookServices;

@RestController
public class BookController {

    @Autowired
    private BookServices bookServices;

    @GetMapping("/books")
    public List<BookModel> getBooks() {
        return this.bookServices.getAllBook();
    }

    @GetMapping("/books/{id}")
    public BookModel getBook(@PathVariable("id") int id) {
        return bookServices.getSingleBook(id);
    }

    @PostMapping("/books")
    public BookModel postBook(@RequestBody BookModel book) {

        BookModel b = bookServices.addBook(book);
        return b;
    }

    @PutMapping("books/{id}")
    public void updateBookById(@RequestBody BookModel book, @PathVariable("id") int id) {
        bookServices.updateBook(book, id);
    }

    @DeleteMapping("books/{id}")
    public void deleteBookById(@PathVariable("id") int id) {
        bookServices.deleteBook(id);
    }
}
