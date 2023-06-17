package _9_desafio_banco_digital_poo_intermediario;

//Classe Cliente representa um cliente do banco
class Cliente {
 private String cpfCnpj;
 private String nome;

 public Cliente(String cpfCnpj, String nome) {
     this.cpfCnpj = cpfCnpj;
     this.nome = nome;
 }

 public String getCpfCnpj() {
     return cpfCnpj;
 }

 public String getNome() {
     return nome;
 }
}
