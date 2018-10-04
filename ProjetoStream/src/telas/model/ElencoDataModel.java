/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import pessoa.Cliente;
import pessoa.Pessoa;
import atros.*;

/**
 *
 * @author josel
 */
public class ElencoDataModel extends AbstractTableModel{

 private ArrayList<Famoso> famosos;
    private String colunas[] = {"Nome","Função", "Sexo", "Nome Personagem"};
    
    public ElencoDataModel(ArrayList<Famoso> a){
        this.famosos = a; 
    }
    
//       public void addLinha(Cliente cl){
//        this.clientes.add(cl);
//        this.fireTableDataChanged();
//    }

    @Override
    public int getRowCount() {
        return this.famosos.size();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        Famoso f = this.famosos.get(rowIndex); //To change body of generated methods, choose Tools | Templates.
        
        
        switch (columnIndex){
            case 0:
                return f.getNome();    
            case 1:
                return f.getFuncao();
            case 2:
                if(f.getSexo() == 'm') return "Masculino";
                else return "Feminino";
            case 3:
                if(f instanceof Atores) return ((Atores) f).getNomePersonagem();
                else return "";
                
            default:
                break;
        }
        return null;
        }
        
    
    
     @Override
    public String getColumnName(int column) {
        return this.colunas[column];
    }
    
    
}
