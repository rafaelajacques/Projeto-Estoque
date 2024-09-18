package poo2.estoque.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class Produto extends BaseParametro {
    private Long codigoSubclasse;
    private Double valor;
    public Long getCodigoSubclasse() {
        return codigoSubclasse;
    }
    public void setCodigoSubclasse(Long codigoSubclasse) {
        this.codigoSubclasse = codigoSubclasse;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Produto() {
        super();
    }
    public Produto(Long codigo, LocalDate dataDeInclusao, LocalDate dataDeAlteracao, String descricao,
            Long codigoSubclasse, Double valor) {
        super(codigo, dataDeInclusao, dataDeAlteracao, descricao);
        this.codigoSubclasse = codigoSubclasse;
        this.valor = valor;
    }

}
