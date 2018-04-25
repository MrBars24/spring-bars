package dev.geraldmichael.barswebapp.bootstrap;

import dev.geraldmichael.barswebapp.model.Author;
import dev.geraldmichael.barswebapp.model.Book;
import dev.geraldmichael.barswebapp.model.Publisher;
import dev.geraldmichael.barswebapp.repositories.AuthorRepository;
import dev.geraldmichael.barswebapp.repositories.BookRepository;
import dev.geraldmichael.barswebapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;

    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        Author carlo = new Author("Carlo","Garcia");
        Publisher psher = new Publisher("Phonix","123Olongapo");
        Book bk = new Book("Test Book","1234",psher);
        carlo.getBooks().add(bk);
        bk.getAuthors().add(carlo);

        publisherRepository.save(psher);
        authorRepository.save(carlo);
        bookRepository.save(bk);

        Author gerald = new Author("Gerald","Austria");
        Publisher ps = new Publisher("IFL","20 caron");
        Book jv = new Book("Jv BBook","4567",ps);
        gerald.getBooks().add(jv);

        publisherRepository.save(ps);
        authorRepository.save(gerald);
        bookRepository.save(jv);

    }
}
