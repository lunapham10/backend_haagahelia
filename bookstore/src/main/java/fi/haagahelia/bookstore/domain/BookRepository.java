package fi.haagahelia.bookstore.domain;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long>{


// now this file is ready, should be just remember to save the file
//Why is it <long book>? 

// That <Long, Book> Means that it uses book id as the reference to each
// book object like the id is in database the primary key of each book
// it needs to know what objects this class is handling, what to store in
// database and framework wants to know it in that way that the types are mentioned inside <  and >

// good to save the file though i think it is my writing that causes saving problem
// ok, but pls dont delete your comment. I think I'll reread later

// yes i can keep the comments, from now on I go back to my usual stuff with upper case
// letter comments, it is not industry standard, it is just for me to understand what was
// comment written by me
// ok

}
