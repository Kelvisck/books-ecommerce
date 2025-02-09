package ecomerce.com.livros.Repository;

import ecomerce.com.livros.domain.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository  extends JpaRepository<Book, Long> {
}
