package poo2.estoque.domain;

import java.time.LocalDate;

public class Funcionario extends BasePessoa {
    private Long codigoTipoFunc;
    private String senha;
    public Long getCodigoTipoFunc() {
        return codigoTipoFunc;
    }
    public void setCodigoTipoFunc(Long codigoTipoFunc) {
        this.codigoTipoFunc = codigoTipoFunc;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Funcionario() {
        super();
    }
    public Funcionario(Long codigo, LocalDate dataDeInclusao, LocalDate dataDeAlteracao, String endereco, String cidade,
            String estado, String cep, String telefone, String email, Long codigoTipoFunc, String senha) {
        super(codigo, dataDeInclusao, dataDeAlteracao, endereco, cidade, estado, cep, telefone, email);
        this.codigoTipoFunc = codigoTipoFunc;
        this.senha = senha;
    }

}
