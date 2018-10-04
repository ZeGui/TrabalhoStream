/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetostream;

import java.util.ArrayList;
import pessoa.*;
import atros.*;
import filmes.Filmes;
import javax.swing.JFrame;
import telas.Principal;

/**
 *
 * @author josel
 */
public class ProjetoStream {
    private static ArrayList<Pessoa> pessoasC
            = new ArrayList<>();
    
    private static ArrayList<Elenco> famososC
            = new ArrayList<>();
    
    private static ArrayList<Filmes> filmesC
            = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame novo = new Principal();
        novo.setVisible(true);
    }
    
    public void insereCliente(String nome, String login, String senha){
        Pessoa p = new Cliente();
        p.setNome(nome);
        p.setLogin(login);
        p.setPassword(senha);
        p.setTipo("USUARIO");
        ((Cliente) p).setStatus("ATIVO");
        pessoasC.add(p);
    }
    
    public void insereAstro(int i, String nome, String funcao, char sexo, String nomePersonagem){
        Elenco novoF = new Elenco();
        Elenco novoA = new Atores();
        if(i == 0){
            novoF.setNome(nome);
            novoF.setFuncao(funcao);
            novoF.setSexo(sexo);
            famososC.add(novoF);
        }else{
            novoA.setNome(nome);
            novoA.setFuncao(funcao);
            novoA.setSexo(sexo);
            ((Atores) novoA).setNomePersonagem(nomePersonagem);
            famososC.add(novoA);
        }
    }
    
    public Elenco procuraElenco(String nome){
        if(famososC != null){
            for(Elenco e: famososC){
                if(e.getNome().equalsIgnoreCase(nome)){
                    return e;
                }
            }
        }
        return null;
    }
    
    public void insereFilme(String titulo, int ano, String genero, int classificacao,
            double duracao, String tipo, ArrayList<Elenco> elenco){
        Filmes novo = new Filmes();
        if(famososC != null){
            novo.setTitulo(titulo);
            novo.setAno(ano);
            novo.setGenero(genero);
            novo.setClassifica(classificacao);
            novo.setDuracao(duracao);
            novo.setTipo(tipo);
            novo.setElencoLista(elenco);
        }
    }
    
    public ArrayList<Pessoa> getListaClientes(){
        return pessoasC;
    }
    public ArrayList<Elenco> getListaFamoso(){
        return famososC;
    }
    
}
