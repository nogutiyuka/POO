package br.ifpr.aula.heranca;

public class Funcionario {
    private String nome;
    private String rg;
    private Endereco endereco;
    private String telefone;
    private String email;
    private ContaBancaria contaBancaria;
    private int hrsTrabalhadas;
    private double valorHora;

    public Funcionario(){

    }

    public String getNome(){
        return this.nome;
    }

    public String rg(){
        return this.rg;
    }

    public Endereco endereco(){
        return this.endereco;
    } 

    public String telefone(){
        return this.telefone;
    }

    public String email(){
        return this.email;
    }

    public ContaBancaria contaBancaria(){
        return this.contaBancaria;
    }

    public int getHrsTrabalhadas(){
        return this.hrsTrabalhadas;
    }

    public double getValorHora(){
        return this.valorHora;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setRg(String rg){
        this.rg = rg;
    }

    public void setEndereco (Endereco endereco){
        this.endereco = endereco;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public void setEmail(String email)[
        this.email = email;
    ]

    public void setContaBancaria (ContaBancaria contaBancaria){
        this.contaBancaria = contaBancaria;
    }

    public void setHrsTrabalhadas(int hrsTrabalhadas){
        this.hrsTrabalhadas = hrsTrabalhadas;
    }

    public void setValorHora(double valorHora){
        this.valorHora = valorHora;
    }    

    public double salario(){
        return this.hrsTrabalhadas * this.valorHora;
    }
    
}
