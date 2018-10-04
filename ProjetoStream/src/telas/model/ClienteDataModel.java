/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import pessoa.*;

/**
 *
 * @author josel
 */
public class ClienteDataModel extends AbstractTableModel{
    private ArrayList<Pessoa> usuarios;
    private String colunas[] = {"Tipo","Nome"};
    
    public ClienteDataModel(ArrayList<Pessoa> a){
        this.usuarios = a; 
    }
    
//       public void addLinha(Cliente cl){
//        this.clientes.add(cl);
//        this.fireTableDataChanged();
//    }

    @Override
    public int getRowCount() {
        return this.usuarios.size();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        Pessoa p = this.usuarios.get(rowIndex); //To change body of generated methods, choose Tools | Templates.
        if(p instanceof Cliente){
        switch (columnIndex){
            case 0:
                return ((Cliente) p).getStatus();    
            case 1:
                return p.getNome();
            case 2:
                return p.getTipo();
            default:
                break;
        }
        }
        return null;
    }
    
     @Override
    public String getColumnName(int column) {
        return this.colunas[column];
    }
    
}
