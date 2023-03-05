
package com.mycompany.appbanco1;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int cpf;
  
    public Pessoa(String nome, int idade, String sexo, int cpf) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    
}
    

