package poo2.estoque.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class ClasseProduto extends BaseParametro {
    public ClasseProduto(){
        super();
    }

    public ClasseProduto(Long codigo, LocalDate dataDeInclusao, LocalDate dataDeAlteracao, String descricao){
        super(codigo, dataDeInclusao, dataDeAlteracao, descricao);        
    }

}
