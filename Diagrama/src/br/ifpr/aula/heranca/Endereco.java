package br.ifpr.aula.heranca;

public class Endereco {
    private String rua;
    private String bairro;
    private int numero;
    private String cep;

    public Endereco(){

    }

    public String getRua(){
        return this.rua;
    }

    public String getBairro(){
        return this.bairro;
    }

    public int getNumero(){
        return this.numero;
    }

    public String getCep(){
        return this.cep;
    }

    public void setRua(String rua){
        this.rua = rua;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setCep(String cep){
        this.cep = cep;
    }


    
}
