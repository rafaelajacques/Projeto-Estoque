package poo2.estoque.domain;

import java.time.LocalDate;

public class TipoFuncionario extends BaseParametro {
    public TipoFuncionario(){
        super();
    }

    public TipoFuncionario(Long codigo, LocalDate dataDeInclusao, LocalDate dataDeAlteracao, String descricao){
        super(codigo, dataDeInclusao, dataDeAlteracao, descricao);
    }
}
