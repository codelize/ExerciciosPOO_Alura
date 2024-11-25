package br.com.alura.exerciciospooalura.modelos;

import br.com.alura.exerciciospooalura.calculos.Classificavel;
import br.com.alura.screenmatch.modelos.Serie;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private br.com.alura.screenmatch.modelos.Serie serie;
    private int totalVisualizacoes;

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(br.com.alura.screenmatch.modelos.Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }

    }
}
