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
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //definindo a estratégia de geração automática (depende do database)
    private Integer id;
    @NonNull
    private String name;

    //aqui determinamos sua relação com produto
    //já que a anotação foi feita pelo outro lado, apenas apontamos o objeto que foi utilizado lá
    @ManyToMany(mappedBy = "categories")
    private List<Product> products = new ArrayList<>();
}
