package dev.geraldmichael.barswebapp.repositories;

import dev.geraldmichael.barswebapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
