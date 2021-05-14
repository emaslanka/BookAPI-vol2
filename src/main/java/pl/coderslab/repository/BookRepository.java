package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.enity.Book;


public interface BookRepository extends JpaRepository<Book,Long> {

}
