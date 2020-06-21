package br.com.pi002.controle;

import java.util.ArrayList;

public class Agenda {
    
    ArrayList<Fisica> pf = new ArrayList<>();
    
    ArrayList<Juridica> pj = new ArrayList<>();

    public void cadastraFisica(Fisica f){
        pf.add(f);
    }
    
    public void cadastraJuridica(Juridica j){
        pj.add(j);
    }
    
}