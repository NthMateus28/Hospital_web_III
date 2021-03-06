package model.Medico;

import java.time.LocalDate;

public class Medico {
    // visibilidade tipo nome;
    public String CRM;
    public String nome;
    public LocalDate dataDeNascimento;
    public String telefoneDeContato;
    public model.Endereco endereco;

    public String getCRM() {
        return this.CRM;
    }

    public String getNome() {
        return this.nome;
    }

    public LocalDate getDataDeNascimento() {
        return this.dataDeNascimento;
    }

    public String getTelefoneDeContato() {
        return this.telefoneDeContato;
    }

    public void setTelefoneDeContato(String telefoneDeContato) {
        this.telefoneDeContato = telefoneDeContato;
    }

    public model.Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(model.Endereco endereco) {
        this.endereco = endereco;
    }
}
