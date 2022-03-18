package com.nelioalves.cursomc.repositories;

import com.nelioalves.cursomc.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {}

//O repository é uma interface que amplia as funções de JpaRepository