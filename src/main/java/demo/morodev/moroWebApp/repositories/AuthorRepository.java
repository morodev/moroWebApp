package demo.morodev.moroWebApp.repositories;

import demo.morodev.moroWebApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
