package poo2.estoque.domain;

import java.time.LocalDate;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseParametro extends BaseIdentificador {
    protected String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BaseParametro() {
        super();
    }

    public BaseParametro(Long codigo, LocalDate dataDeInclusao, LocalDate dataDeAlteracao, String descricao) {
        super(codigo, dataDeInclusao, dataDeAlteracao);
        this.descricao = descricao;
    }

}
