package br.com.dio.desafio.dominio;

import java.time.LocalDate;

/**
 * @author Mateus santos
 * @since 29/05/2024
 * @version 1.0
 */
public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDate data;

    /**
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;

    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;

    }

    public String getDescricao () {
        return this.descricao;
    }

    /**
     * @param data
     */
    public void setData (LocalDate data) {
        this.data = data;

    }

    @Override
    public String toString() {
        return "Mentoria [titulo=" + titulo + ", descricao=" + descricao + ", data=" + data + "]";
    }

}
