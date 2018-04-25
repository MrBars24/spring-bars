package dev.geraldmichael.barswebapp.repositories;

import dev.geraldmichael.barswebapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
