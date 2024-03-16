/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Aluno
 */
public class Funcionario extends Pessoa{
    private String matricula;
    private int data_contratacao;

    public Funcionario(String matricula, int data_contratacao, String nome, String cpf, String data_nascimento) {
        super(nome, cpf, data_nascimento);
        this.matricula = matricula;
        this.data_contratacao = data_contratacao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getData_contratacao() {
        return data_contratacao;
    }

    public void setData_contratacao(int data_contratacao) {
        this.data_contratacao = data_contratacao;
    }
    
    
    
    
}
