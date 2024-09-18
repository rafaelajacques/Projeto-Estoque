package poo2.estoque.domain;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseIdentificador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long codigo;

    @DateTimeFormat(pattern="yyy-MM-dd-HH.mm.ss")
    protected LocalDate dataDeInclusao;

    @DateTimeFormat(pattern="yyy-MM-dd-HH.mm.ss")
    protected LocalDate dataDeAlteracao;

    public Long getCodigo() {
        return codigo;
    }
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    public LocalDate getDataDeInclusao() {
        return dataDeInclusao;
    }
    public void setDataDeInclusao(LocalDate dataDeInclusao) {
        this.dataDeInclusao = dataDeInclusao;
    }
    public LocalDate getDataDeAlteracao() {
        return dataDeAlteracao;
    }
    public void setDataDeAlteracao(LocalDate dataDeAlteracao) {
        this.dataDeAlteracao = dataDeAlteracao;
    }
    public BaseIdentificador() {
    }
    public BaseIdentificador(Long codigo, LocalDate dataDeInclusao, LocalDate dataDeAlteracao) {
        this.codigo = codigo;
        this.dataDeInclusao = dataDeInclusao;
        this.dataDeAlteracao = dataDeAlteracao;
    }

}
