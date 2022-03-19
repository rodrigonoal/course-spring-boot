package com.nelioalves.cursomc.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NonNull
    private String name;
    @NonNull
    private Double price;

    //associação com a tabela de categorias:
    //aqui temos uma associação many to many (produtos podem ter > 1 categoria & vice-versa)
    //a tabela "virtual" PRODUCT_CATEGORY relaciona os ids dos produtos com os ids das categorias
    @ManyToMany
    @JoinTable(name ="PRODUCT_CATEGORY",
    joinColumns = @JoinColumn(name= "product_id"),
    inverseJoinColumns = @JoinColumn(name="category_id"))
    private List<Category> categories = new ArrayList<>();
}
