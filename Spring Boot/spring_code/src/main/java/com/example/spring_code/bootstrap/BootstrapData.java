package com.example.spring_code.bootstrap;

import com.example.spring_code.domain.Author;
import com.example.spring_code.domain.Book;
import com.example.spring_code.domain.Publisher;
import com.example.spring_code.repositories.AuthorRepository;
import com.example.spring_code.repositories.BookRepository;
import com.example.spring_code.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (authorRepository.count() > 0 || bookRepository.count() > 0 || publisherRepository.count() > 0) {
            System.out.println("Data was previously initialized");

            System.out.println("Number of authors: " + authorRepository.count());
            System.out.println("Number of books: " + bookRepository.count());
            return;
        }

        Publisher pub = new Publisher("nombre","calle", "ciudad", "stado", "zip");
        publisherRepository.save(pub);

        Author eric = new Author("Eric", "Evans");

        Book ddd = new Book("Domain Driven Design", "123412");

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        pub.getBooks().add(ddd);
        publisherRepository.save(pub);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("nombreNuevo", "ISBN2");

        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        pub.getBooks().add(noEJB);
        publisherRepository.save(pub);


        System.out.println("Started in bootstrap");

        System.out.println("Number of publishers: " + publisherRepository.count());
        System.out.println("Number of authors: " + authorRepository.count());
        System.out.println("Number of books: " + bookRepository.count());
        System.out.println("Publisher number of books: " + pub.getBooks().size());

    }
}
