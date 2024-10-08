package br.com.fiap.bean;

import javax.swing.*;

public class Equipe {

    private String nome;
    private String[] integrantes;

    public Equipe() {
    }

    public Equipe(String[] integrantes, String nome) {
        this.integrantes = integrantes;
        this.nome = nome;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String[] getIntegrantes() { return integrantes; }
    public void setIntegrantes(String[] integrantes) { this.integrantes = integrantes; }

    public void listaEquipe(){
        String exibe = "Nome da Equipe: " + nome;
        int cont = 1;
        for (String i : integrantes) {
            exibe += "\nIntegrante " + cont + ": " + i;
            cont++;
        }
        JOptionPane.showMessageDialog(null, exibe);
    }
}
