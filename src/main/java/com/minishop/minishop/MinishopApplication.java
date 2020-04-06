package com.minishop.minishop;

import com.minishop.minishop.catalog.Product;
import com.minishop.minishop.catalog.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SpringBootApplication
public class MinishopApplication {

    public static void main(String[] args) {
        SpringApplication.run(MinishopApplication.class, args);
    }

//     @Bean
//     public CommandLineRunner commandLineRunner(ProductRepository productRepository) {
//         return args -> {
//             List<Product> products = IntStream.range(1, 10)
//                     .mapToObj(i -> new Product(UUID.randomUUID(), "Product #" + i,
//                             "Product #" + i + " description"))
//                     .collect(Collectors.toList());
//             productRepository.getProducts().addAll(products);
//         };
//     }
}

