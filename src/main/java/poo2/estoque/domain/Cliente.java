package poo2.estoque.domain;

import java.time.LocalDate;

public class Cliente extends BasePessoa {
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Cliente() {
        super();
    }

    public Cliente(Long codigo, LocalDate dataDeInclusao, LocalDate dataDeAlteracao, String endereco, String cidade,
            String estado, String cep, String telefone, String email, String cpf) {
        super(codigo, dataDeInclusao, dataDeAlteracao, endereco, cidade, estado, cep, telefone, email);
        this.cpf = cpf;
    }

}
