package br.com.dio.desafio.dominio;

import java.time.LocalDate;

/**
 * @author Mateus santos
 * @since 29/05/2024
 * @version 1.0
 */
public class Mentoria extends Conteudo {
    private LocalDate data;

    /**
     * @param titulo
     */

    @Override
    /**
     * Calcular o xp, toda fez que uma nova mentoria é instanciado o método irá retornar o XP_PADRAO + 20d
     */
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    /**
     * @param data
     */
    public void setData(LocalDate data) {
        this.data = data;

    }

    @Override
    public String toString() {
        return "Mentoria [data=" + data + "]";
    }

}
