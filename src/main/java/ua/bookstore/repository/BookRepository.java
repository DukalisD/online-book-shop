package ua.bookstore.repository;

import java.util.List;
import ua.bookstore.model.Book;

public interface BookRepository {
    Book save(Book book);

    List<Book> findAll();
}
