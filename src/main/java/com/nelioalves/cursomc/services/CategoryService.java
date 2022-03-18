package com.nelioalves.cursomc.services;

import com.nelioalves.cursomc.domain.Category;
import com.nelioalves.cursomc.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired //intancia automaticamente
    private CategoryRepository repo;
    //para manipular o conteúdo do repository

    public Category search(Integer id) {
        Optional <Category> object = repo.findById(id);
        return object.orElse(null);
    }
    //se ele não encontrar na tabela, retornará um nulo
}
