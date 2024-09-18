package poo2.estoque.domain;

import java.time.LocalDate;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BasePessoa extends BaseIdentificador {
    protected String endereco;
    protected String cidade;
    protected String estado;
    protected String cep;
    protected String telefone;
    protected String email;
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public BasePessoa() {
        super();
    }
    public BasePessoa(Long codigo, LocalDate dataDeInclusao, LocalDate dataDeAlteracao, String endereco, String cidade,
            String estado, String cep, String telefone, String email) {
        super(codigo, dataDeInclusao, dataDeAlteracao);
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
    }
}
