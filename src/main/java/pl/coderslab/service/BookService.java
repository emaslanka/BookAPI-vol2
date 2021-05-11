package pl.coderslab.service;

import pl.coderslab.enity.Book;

import java.util.List;

public interface BookService {

    List<Book> getBooks();

    Book findBook(Long id);

    void addBook(Book book);

    void deleteBook(Long id);

    void updateBook(Book book);
}
