package com.prova.desenvolverCRUD.repository;

import com.prova.desenvolverCRUD.model.produto.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
