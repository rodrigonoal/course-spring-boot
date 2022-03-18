package com.nelioalves.cursomc.resources;

import com.nelioalves.cursomc.domain.Category;
import com.nelioalves.cursomc.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //controlador
@RequestMapping(value = "/categories") //nomear o endpoint
public class CategoryResource {

    @Autowired
    private CategoryService service;

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id) {
        Category object = service.search(id);
        return ResponseEntity.ok().body(object);
    }
}
