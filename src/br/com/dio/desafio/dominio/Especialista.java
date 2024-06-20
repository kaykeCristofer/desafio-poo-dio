package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Especialista {
    private String nome;
    private String formacao;
    private Set<Conteudo> conteudosMinistrados = new LinkedHashSet<>();

    public Set<Conteudo> getConteudosMinistrados() {
        return conteudosMinistrados;
    }
    
    public void setConteudosMinistrados(Set<Conteudo> conteudosMinistrados) {
        this.conteudosMinistrados = conteudosMinistrados;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
