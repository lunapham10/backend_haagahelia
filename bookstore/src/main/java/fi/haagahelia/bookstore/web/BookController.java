package fi.haagahelia.bookstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

import fi.haagahelia.bookstore.domain.Book;
import fi.haagahelia.bookstore.domain.BookRepository;

@Controller
public class BookController {

    private BookRepository repository;
    public BookController(BookRepository repository){
        this.repository = repository;
    }

    @RequestMapping(
        value = {"/booklist"},
        method = {RequestMethod.GET}
    )
    public String bookList(Model model){
        model.addAttribute("books", repository.findAll());
        return "booklist";
    }
    
    @RequestMapping(
        value = "/addbook"
    )
    public String addBook(Model model){
        model.addAttribute("book", new Book());
        return "addbook";
    }


    // NEED TO MAP ONE GET ENDPOINT HERE LIKE /LISTBOOKS



}
