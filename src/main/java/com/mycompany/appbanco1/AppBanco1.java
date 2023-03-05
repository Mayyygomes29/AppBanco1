/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.appbanco1;

public class AppBanco1 {

    public static void main(String[] args) {
   
  Cliente c = new Cliente();
  c.setAberta(false);
  c.setNome("Mayara");
  c.setTipoDeConta("CC");
  c.setPessoaJuridica(true);
  c.setCnpj(123456);
  c.setSaldo(300.00f);
  c.depositar(1000f);
  c.extrato();
        System.out.println("==============================================="); 
 
  Cliente p[] = new Cliente[1];
 p[0] = new Cliente("rafinha_23", "1234");
 p[0].abrirConta("Raphaela", "Feminino", 23, true, "CC");
 p[0].setCpf(555555);
 p[0].setSaldo(500f);
 p[0].depositar(500f);
 p[0].setTipoDeConta("CP");
 
 p[0].fecharConta(0);
 
        System.out.println("=================================================");
        
  Cliente p1 = new Cliente();
  p1.abrirConta("Marcos", "Maculino", 50, false, "CP");
  p1.depositar(100f);
  p1.setCnpj(222222);
  
  p1.sacar(50f);
  p1.extrato();

  
    }}