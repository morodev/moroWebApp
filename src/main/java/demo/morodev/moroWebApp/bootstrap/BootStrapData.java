package demo.morodev.moroWebApp.bootstrap;

import demo.morodev.moroWebApp.domain.Author;
import demo.morodev.moroWebApp.domain.Book;
import demo.morodev.moroWebApp.domain.Publisher;
import demo.morodev.moroWebApp.repositories.AuthorRepository;
import demo.morodev.moroWebApp.repositories.BookRepository;
import demo.morodev.moroWebApp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Luca Moro on 01/10/2020 18:34
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author LucaMoro = new Author("Luca", "Moro");
        Book moroDev = new Book("Angular 10 - Study and do it", "1827367292");

        LucaMoro.getBooks().add(moroDev);
        moroDev.getAuthors().add(LucaMoro);

        authorRepository.save(LucaMoro);
        bookRepository.save(moroDev);

        Author paolo = new Author("Paolo", "Rossi");
        Book newBook = new Book("J2EE Development guide", "4395834958345");

        paolo.getBooks().add(newBook);
        newBook.getAuthors().add(paolo);

        authorRepository.save(paolo);
        bookRepository.save(newBook);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());

        Publisher publisherOne = new Publisher("APOGEO", "Via Roma", "Roma", "ITALIA", "00100");

        publisherRepository.save(publisherOne);
        System.out.println("Tot Publisher: " + publisherRepository.count());

    }
}
