package fi.haagahelia.bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import fi.haagahelia.bookstore.domain.Book;
import fi.haagahelia.bookstore.domain.BookRepository;
import fi.haagahelia.bookstore.domain.Category;
import fi.haagahelia.bookstore.domain.CategoryRepository;

@SpringBootTest(classes = BookstoreApplication.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class BookRepositoryTest {

    @Autowired
    private BookRepository repository;

    @Autowired
    private CategoryRepository cRepository;

    @Test
    public void findByTitle() {
        List<Book> books = repository.findByTitle("Art of Vietnam");

        assertThat(books).hasSize(1);
        assertThat(books.get(0).getAuthor()).isEqualTo("Catherine Noppe; Jean-François Hubert");
    }

    @Test
    public void addNewBook() {
        Category category = new Category("Comic");
        cRepository.save(category);
        Book book = new Book("Conan detective", "Aoyama", 1994, "978-8864200262", 9.9, category );
        repository.save(book);
        assertThat(book.getId()).isNotNull();
    }

    @Test
    public void deleteNewBook() {
        List<Book> books = repository.findByTitle("Dictionary of Vietnamese Traditional Culture");
        Book book = books.get(0);
        repository.delete(book);
        List<Book> newBooks = repository.findByTitle("Dictionary of Vietnamese Traditional Culture");
        assertThat(newBooks).hasSize(0);
    }
}
