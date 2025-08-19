package ua.bookstore.service;

import java.util.List;
import ua.bookstore.model.Book;

public interface BookService {
    Book save(Book book);

    List<Book> findAll();
}
