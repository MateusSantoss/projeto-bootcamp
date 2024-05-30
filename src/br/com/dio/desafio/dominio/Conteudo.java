package br.com.dio.desafio.dominio;
/**
 * @author Mateus santos
 * @since 29/05/2024
 * @version 1.0
 * 
 * A classe apresenta os atributos padrões de todos os conteudos.
 */
public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "titulo: " + titulo + "\n descricao: " + descricao;
    }

}