package packt.springboot.cookbook.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import packt.springboot.cookbook.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    public Book findBookByIsbn(String isbn);
}
