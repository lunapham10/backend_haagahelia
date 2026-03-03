package fi.haagahelia.bookstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
// import org.springframework.ui.Model;

import fi.haagahelia.bookstore.domain.Book;
import fi.haagahelia.bookstore.domain.BookRepository;
//import fi.haagahelia.bookstore.domain.CategoryRepository;
import java.util.List;
import java.util.Optional;
import java.util.Locale.Category;

import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookRestController {

    private BookRepository repository;

    // private CategoryRepository cRepository;

    public BookRestController(BookRepository repository) {
        this.repository = repository;
        // this.cRepository = cRepository;
    }

    // RESTful service to get all books
    @RequestMapping(value = "/books", method = { RequestMethod.GET })
    public @ResponseBody List<Book> bookListRest() {
        return (List<Book>) repository.findAll();
    }

    // RESTful service to get book by id
    @RequestMapping(value = "/books/{id}", method = RequestMethod.GET)
    public @ResponseBody Optional<Book> findBookRest(@PathVariable("id") Long id) {
        return repository.findById(id);
    }

    // RESTful service to save new book
    @RequestMapping(value = "/books", method = RequestMethod.POST)
    public @ResponseBody Book saveNewBookRest(@RequestBody Book book, Category category) {
        repository.save(book);
        return book;
    }

    // RESTful service to searching book by title or author
    @RequestMapping(value = "/books/search/author", method = RequestMethod.GET)
    public @ResponseBody List<Book> findByAuthor (@RequestParam(value="author") String author){
        return repository.findByAuthor(author);
    }

    @RequestMapping(value = "/books/search/title", method = RequestMethod.GET)
    public @ResponseBody List<Book> findbyTitle (@RequestParam(value="title") String title){
        return repository.findByTitle(title);
    }
    // NEED TO MAP ONE GET ENDPOINT HERE LIKE /LISTBOOKS

}
