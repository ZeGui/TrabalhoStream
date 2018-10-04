/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filmes;

import java.util.ArrayList;
import atros.Elenco;

/**
 *
 * @author josel
 */
public class Filmes {
    private String titulo;
    private int ano;
    private String genero;
    private int classifica;
    private double duracao;
    private String tipo;
    private static ArrayList<Elenco> elenco
            = new ArrayList<>();
    private static ArrayList<Integer> nota
            = new ArrayList<>();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getClassifica() {
        return classifica;
    }

    public void setClassifica(int classifica) {
        this.classifica = classifica;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Elenco getElenco() {
        for(Elenco f: elenco){
            return f;
        }
        return null;
    }

    public void setElenco(Elenco elenco) {
        this.elenco.add(elenco);
    }
    
     public int getNota() {
        for(Integer i: nota){
            return i;
        }
        return 0;
    }

    public void setElenco(Integer i) {
        this.nota.add(i);
    }
    
    public void setElencoLista(ArrayList<Elenco> elenco){
        this.elenco = elenco;
    }
    
}
