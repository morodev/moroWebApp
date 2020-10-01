package demo.morodev.moroWebApp.repositories;

import demo.morodev.moroWebApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
