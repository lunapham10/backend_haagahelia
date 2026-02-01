package fi.haagahelia.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.bookstore.domain.Book;
import fi.haagahelia.bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner bookDemo(BookRepository repository) {
		return (args) -> {
			// Your code...add some demo data to db

			// SO IN HERE YOU SHOULD CREATE BOOK OBJECTS, THE ORDER OF PARAMETERS
			// FOR BOOKS MIGHT BE WRONG, DEPENDING ON YOUR CONSTRUCTOR, BOOK.JAVA DOES
			// NOT HAVE ID SET HERE BECAUSE FRAMEWORK WANT TO SET THAT

/*    public Book(String title, String author, int publicationYear, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isbn = isbn;
        this.price = price;
    }
*/
		// NOW IT IS ALL CORRECT HERE YOU JUST NEED TO CREATE BOOK OBJECTS LIKE YOU
		// DID IN PROGRAMMING 1 AND PROGRAMMING 2. BOOK OBJECTS CAN BE CREATED ANY WAY
		// YOU LIKE BUT THEY CANNOT HAVE ID
			Book book1 = new Book();
			// YOU NEED TO IMPORT BOOK
			book1.setTitle("Culture and Customs of Vietnam");
			book1.setAuthor("Mark W. McLeod; Nguyen Thi Dieu");
			book1.setPublicationYear(2001);
			book1.setIsbn("9780313304859");
			book1.setPrice(29.95);
			// HERE SHOULD BE repository INSTEAD OF BookRepository, the name is from
			// the parameter
			repository.save(book1);
			// NOW I HAVE TO THINK WHAT IS WRONG HERE, IT LOOKS LIKE RIGHT
			Book book2 = new Book();
			book2.setTitle("Dictionary of Vietnamese Traditional Culture");
			book2.setAuthor("Hữu Ngọc");
			book2.setPublicationYear(2012);
			book2.setIsbn("9786047703166");
			book2.setPrice(24.95);
			repository.save(book2);

			Book book3 = new Book();
			book3.setTitle("Viet Nam: Tradition and Change");
			book3.setAuthor("Hữu Ngọc");
			book3.setPublicationYear(2016);
			book3.setIsbn("9780896803022");
			book3.setPrice(24.95);
			repository.save(book3);

			Book book4 = new Book();
			book4.setTitle("Vietnamese Food and Food Culture");
			book4.setAuthor("Paul B. Kennedy");
			book4.setPublicationYear(2025);
			book4.setIsbn("9780804857413");
			book4.setPrice(24.99);
			repository.save(book4);

			Book book5 = new Book();
			book5.setTitle("Art of Vietnam");
			book5.setAuthor("Catherine Noppe; Jean-François Hubert");
			book5.setPublicationYear(2003);
			book5.setIsbn("9781859958605");
			book5.setPrice(34.95);
			repository.save(book5);
			// JUST REMEMBER ALWAYS TO HAVE THIS SAVE COMMAND LIKE YOU
			// ARE HAVING FOR BOOK ON LINE 47

		// YOU HAVE ERROR IN YOUR FILE HERE THAT ON LINE 16 IT SHOULD BE
		// BOOKREPOSITORY NOT BOOKSTORE AND THEM IMPORT THAT
		// IMPORT FI.HAAGAHELIA.BOOKSTORE.DOMAIN.*



			// SO HERE WE NEED TO JUST LIKE IN PROGRAMMING 1 AND 2 GENERATE NORMAL BOOK
			// OBJECTS JUST DIFFERENCE IS THAT THEY CANNOT HAVE ID, BECAUSE FRAMEWORK AND
			// DATABASE WILL DECIDE THOSE

			// YES THE LOG THING THAT WAS HERE IS NOT MANDATORY

		};
	}
}


