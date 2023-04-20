package br.ifpr.aula.heranca;

public class ContaBancaria {
    private int agencia;
    private int numero;
    private int numeroBanco;
    private String nomeBanco;
    private String nomeTitular;
    private String tipoConta;

    public ContaBancaria(){

    }

    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public int getNumeroBanco() {
        return this.numeroBanco;
    }

    public String getNomeBanco() {
        return this.nomeBanco;
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public String getTipoConta() {
        return this.tipoConta;
    }

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNumeroBanco(int numeroBanco) {
        this.numeroBanco = numeroBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
    
}
