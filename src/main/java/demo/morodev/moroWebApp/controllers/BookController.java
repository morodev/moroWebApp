package demo.morodev.moroWebApp.controllers;

import demo.morodev.moroWebApp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create dy Luca Moro on 04/10/2020 18:46
 */
@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {

        model.addAttribute( "books", bookRepository.findAll());

        return "books/list";
    }
}
