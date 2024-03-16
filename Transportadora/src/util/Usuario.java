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
public interface Usuario {

    public static final String contato_emergencia = "Suporte@transporte.br";

    public abstract boolean login(String login, String senha);
    public abstract boolean logoff(String login, String senha);
    

}
