package poo2.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import poo2.estoque.domain.ClasseProduto;

public interface IClasseProdutoRepositorio extends JpaRepository<ClasseProduto, Long> {
    
}
