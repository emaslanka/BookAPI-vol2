package pl.coderslab.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import pl.coderslab.enity.Book;
import pl.coderslab.repository.BookRepository;
import java.util.List;


@Repository
@Primary
public class JpaBookService implements BookService {

    private final BookRepository bookRepository;

    public JpaBookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }




    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book findBook(Long id) {
        Book book= bookRepository.getOne(id);
        return book;

    }

    @Override
    public void addBook(Book book) {
        bookRepository.save(book);

    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);

    }

    @Override
    public void updateBook(Book book) {

        bookRepository.save(book);

    }

}


