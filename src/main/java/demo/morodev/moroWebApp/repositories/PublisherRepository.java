package demo.morodev.moroWebApp.repositories;

import demo.morodev.moroWebApp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
