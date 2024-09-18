package poo2.estoque.domain;

import java.time.LocalDate;

public class Fornecedor extends BasePessoa {
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Fornecedor() {
        super();
    }

    public Fornecedor(Long codigo, LocalDate dataDeInclusao, LocalDate dataDeAlteracao, String endereco, String cidade,
            String estado, String cep, String telefone, String email, String cnpj) {
        super(codigo, dataDeInclusao, dataDeAlteracao, endereco, cidade, estado, cep, telefone, email);
        this.cnpj = cnpj;
    }

}
