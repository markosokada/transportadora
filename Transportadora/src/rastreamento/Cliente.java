package rastreamento;

import util.Pessoa;

public class Cliente extends Pessoa{
    private String id;
    private String endereco;
    private String cep;
    private String telefone;
    private String email;

    public Cliente(String id, String endereco, String cep, String telefone, String email, String nome, String cpf, String data_nascimento) {
        super(nome, cpf, data_nascimento);
        this.id = id;
        this.endereco = endereco;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
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
    
    
}
