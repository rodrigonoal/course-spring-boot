package com.nelioalves.cursomc.resources;

import com.nelioalves.cursomc.domain.Category;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController //controlador
@RequestMapping(value="/categories") //nomear o endpoint
public class CategoryResource {

    @RequestMapping(method = RequestMethod.GET)
    public List<Category> list() {

        Category cat1 = new Category(1, "Informatics");
        Category cat2 = new Category(2, "Office");

        List<Category> array = new ArrayList<>();
        array.add(cat1);
        array.add(cat2);

        return array;
    }

}
