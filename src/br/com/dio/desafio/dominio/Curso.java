package br.com.dio.desafio.dominio;

/**
 * @author Mateus santos
 * @version 1.0
 * @since 29/05/2024
 * 
 * 
 */
public class Curso extends Conteudo {
    private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

   
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

}
