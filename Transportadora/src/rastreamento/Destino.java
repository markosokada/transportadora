/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rastreamento;

/**
 *
 * @author Aluno
 */
public class Destino {
    private String cep;
    private String rua;
    private String bairro;
    private String numero;
    private String area;

    public Destino(String cep, String rua, String bairro, String numero, String area) {
        this.cep = cep;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.area = area;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    
}
