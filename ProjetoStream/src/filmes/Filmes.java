/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filmes;

import java.util.ArrayList;
import atros.Famoso;

/**
 *
 * @author josel
 */
public class Filmes {
    private String titulo;
    private String genero;
    private int classifica;
    private double duracao;
    private String tipo;
    private ArrayList<Famoso> elenco
            = new ArrayList<>();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public ArrayList<Famoso> getElenco() {
        return elenco;
    }

    public void setElenco(Famoso elenco) {
        this.elenco = elenco;
    }
    
}
