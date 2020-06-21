package br.com.pi002.controle;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PFTableModel extends AbstractTableModel {
    
    private List<Fisica> dados = new ArrayList<>();
    private String[] colunas = {"Nome", "Celular", "Email", "CPF"};

    @Override
    public String getColumnName(int column) {
        return colunas [column];
    }
    
    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return dados.get(linha).getNome();
            case 1:
                return dados.get(linha).getFone();
            case 2:
                return dados.get(linha).getEmail();
            case 3:
                return dados.get(linha).getCpf();
        }
        return null;
    }
    
    public void addRow (Fisica f) {
        this.dados.add(f);
        this.fireTableDataChanged();
    }
}
