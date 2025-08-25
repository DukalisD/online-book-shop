package ua.bookstore;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.bookstore.model.Book;
import ua.bookstore.service.BookService;

@SpringBootApplication
public class OnlineBookShopApplication {
    @Autowired
    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(OnlineBookShopApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Book book = new Book();
                book.setTitle("Book 1");
                book.setAuthor("Author 1");
                book.setPrice(BigDecimal.valueOf(450));
                book.setIsbn("ISBN 1");

                bookService.save(book);
                System.out.println(bookService.findAll());
            }
        };
    }
}
