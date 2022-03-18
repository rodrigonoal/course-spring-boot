package com.nelioalves.cursomc;

import com.nelioalves.cursomc.domain.Category;
import com.nelioalves.cursomc.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

    @Autowired
    private CategoryRepository categoryRepository;

    public static void main(String[] args) {
        SpringApplication.run(CursomcApplication.class, args);
    }

    //command line runner permite que ações ocorram no momento da criação da aplicação
    // para tanto devemos implementar o método run com override

    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(null, "Informatics");
        Category cat2 = new Category(null, "Office");

        categoryRepository.saveAll(Arrays.asList(cat1, cat2));
    }
}
