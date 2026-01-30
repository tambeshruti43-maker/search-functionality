package com.assignment.search;
import com.assignment.search.service.SearchService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SearchServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SearchServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner run(SearchService searchService) {
        return args -> {
            System.out.println("Filtered Products:");
            System.out.println(searchService.searchAffordableProducts());
        };
    }
}
