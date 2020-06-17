package br.com.pi002.controle;

public class Juridica extends Pessoa {
    
    private String cnpj;
    
    public Juridica(String nome, String fone, String email, String cnpj) {
        super(nome, fone, email);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return super.getNome() + " - " + super.getEmail() + " - " + super.getFone() + " - " + this.getCnpj();
    }
    
    
}
