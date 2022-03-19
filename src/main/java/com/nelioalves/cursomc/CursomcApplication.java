package com.nelioalves.cursomc;

import com.nelioalves.cursomc.domain.Category;
import com.nelioalves.cursomc.domain.Product;
import com.nelioalves.cursomc.repositories.CategoryRepository;
import com.nelioalves.cursomc.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(CursomcApplication.class, args);
    }

    //command line runner permite que ações ocorram no momento da criação da aplicação
    // para tanto devemos implementar o método run com override

    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category("Informatics");
        Category cat2 = new Category("Office");

        Product p1 = new Product("Computer", 2000.00);
        Product p2 = new Product("Printer", 800.00);
        Product p3 = new Product("Mouse", 80.00);

        cat1.getProducts().addAll(Arrays.asList(p1, p2, p3));
        cat2.getProducts().addAll(Arrays.asList(p2));

        p1.getCategories().addAll(Arrays.asList(cat1));
        p2.getCategories().addAll(Arrays.asList(cat1, cat2));
        p3.getCategories().addAll(Arrays.asList(cat1));

        categoryRepository.saveAll(Arrays.asList(cat1, cat2));
        productRepository.saveAll(Arrays.asList(p1, p2, p3));
    }
}
