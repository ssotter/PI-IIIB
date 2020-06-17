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
    
 /*   public static void main(String[] args) {
        
        ArrayList<Fisica> pf = new ArrayList<>();
        
        ArrayList<Juridica> pj = new ArrayList<>();
        
        Fisica f1 = new Fisica("Sergio Sotter", "984125555", "sergio@", "56229135000");
        
        Juridica j1 = new Juridica("Network Informática", "30351696", "network-rg@", "90950338000288");
        
        pf.add(f1);
        pj.add(j1);
        
        System.out.println(f1);
        System.out.println(j1);
        
    }
    
    */   
}