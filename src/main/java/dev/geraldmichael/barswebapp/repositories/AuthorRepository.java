package dev.geraldmichael.barswebapp.repositories;

import dev.geraldmichael.barswebapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
