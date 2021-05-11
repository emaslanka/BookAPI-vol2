package pl.coderslab.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import pl.coderslab.enity.Book;
import pl.coderslab.repository.BookRepository;

import java.util.List;

public class JpaBookService implements BookService {

    private final BookRepository bookRepository;

    public JpaBookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }



    @Primary
    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book findBook(Long id) {
        Book book= new Book();

        return book;

    }

    @Override
    public void addBook(Book book) {

    }

    @Override
    public void deleteBook(Long id) {

    }

    @Override
    public void updateBook(Book book) {

    }

}


