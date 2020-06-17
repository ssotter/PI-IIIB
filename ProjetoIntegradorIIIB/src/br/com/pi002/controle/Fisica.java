package br.com.pi002.controle;

public class Fisica extends Pessoa {
    private String cpf;
    
    public Fisica(String nome, String fone, String email, String cpf) {
        super(nome, fone, email);
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return super.getNome() + " - " + super.getEmail() + " - " + super.getFone() + " - " + this.getCpf();
    }
    
    

}
