/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.projeto4;

import java.util.ArrayList;
/**
 *
 * @author suporte03
 */
public class Discos {

    private String nome;
    private String ano;
    private String genero;
    private Musica musica;
    private Banda banda;

    public Discos(String nome, String ano, String genero, Musica musica, Banda banda) {
        this.nome = nome;
        this.ano = ano;
        this.genero = genero;
        this.musica = musica;
        this.banda = banda;
    }

    public String getNome() {
        return nome;
    }

    public String getAno() {
        return ano;
    }

    public String getGenero() {
        return genero;
    }

    public Musica getMusica() {
        return musica;
    }

    public Banda getBanda() {
        return banda;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setMusica(Musica musica) {
        this.musica = musica;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }
}
