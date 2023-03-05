
package com.mycompany.appbanco1;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cliente extends Pessoa {
   protected String login;
   protected String senha;
   protected boolean aberta;
   protected String tipoDeConta;
   protected float saldo;
   protected float saque;
   protected float depositado;
   protected int cnpj;
   protected boolean pessoaFisica;
   protected boolean pessoaJuridica;

  

    Cliente() {}

    public Cliente( String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    
  public void abrirConta(String nome, String sexo, int idade, boolean pessoaFisica, String tipoDeConta ){
      
      this.nome = nome;
       this.sexo = sexo;
       this.idade = idade; 
      if (this.getPessoaFisica() == true) {
          this.getPessoaFisica();
          this.getCpf();
          
      } else {
          this.getPessoaJuridica();
          this.getCnpj();
      }
      this.tipoDeConta = tipoDeConta;
      this.aberta = true;
      System.out.println("Conta Aberta com sucesso!");
  }
    public void fecharConta(float saldo){
       this.aberta = true;
        if (this.saldo == 0) {
    System.out.println("Conta fechada com sucesso!"); 
        } else {
            System.out.println("Não pode encerrar com dinheiro na conta!");
        }
    }
   public void entrarConta(String login, String senha){
       if (this.aberta == false) {
           this.login = login;
           this.senha = senha;
           this.aberta = true;
           System.out.println("Entrando na conta!");
           
       } else {
           System.out.println("Conta já está aberta!");
       }
   }
   public void SairConta(){
       if (this.getAberta() == true) {
           this.aberta = false;
           System.out.println("Saindo da conta!");
       } else {
           System.out.println("A conta já está fechada!");
       }     
   }
   public void sacar(float valor){

if (this.aberta == true && this.saldo >= valor) {
   this.saldo -= valor;
   this.saque = valor;  
   
   System.out.println("Saque concluido no valor de " + this.saque);

} else {
    System.out.println("Não foi possível sacar!");
}
}
public void extrato(){
    if (this.getAberta() == true ) {
        System.out.println("==================Extrato================="); 
    System.out.println("Nomes: " + this.nome);
    System.out.println("Tipo de Conta: " + this.getTipoDeConta());
    if (this.getPessoaFisica() == true) {
          this.getPessoaFisica();
          this.getCpf();
        System.out.println("Cpf :" + this.getCpf());      
      } else {
          this.getPessoaJuridica();
          this.getCnpj();
        System.out.println("Cnpj: " + this.getCnpj());
    } 
    System.out.println("Deposito: " + this.getDepositado());
    System.out.println("Saque: " + this.getSaque());
    System.out.println("Saldo: " + this.getSaldo());
    System.out.println("Data: " + LocalDate.now());
    System.out.println("Hora: " + LocalTime.now());   
} else{
        System.out.println("Acesse sua conta!");
    }
    }

public void depositar(float valor){
if (this.aberta == true) {
    this.saldo += valor;
    this.depositado = valor;
    System.out.println("Deposito concluido no valor de " + valor);
} else {
    System.out.println("Acesse sua conta!");
}
}
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean getAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

   

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaque() {
        return saque;
    }

    public void setSaque(float saque) {
        this.saque = saque;
    }

    public float getDepositado() {
        return depositado;
    }

    public void setDepositado(float depositado) {
        this.depositado = depositado;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public boolean getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(boolean pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public boolean getPessoaJuridica() {
        return pessoaJuridica;
    }

    public void setPessoaJuridica(boolean pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }
 
    }
    
