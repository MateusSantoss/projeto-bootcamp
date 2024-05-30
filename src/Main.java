import java.time.LocalDate;

import br.com.dio.desafio.dominio.*;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Kotlin");
        curso2.setDescricao("descrição curso Kotlin");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println("__________________________________________________________________");

        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMateus = new Dev();
        devMateus.setNome("Mateus");
        devMateus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Mateus: " + devMateus.getConteudoInscritos());
        devMateus.progedir();
        System.out.println("_________________________________________________________________");

        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos");
        devMarcos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Marcos: " + devMarcos.getConteudoInscritos());
        devMarcos.progedir();
        devMarcos.progedir();
    
        System.out.println("XP: " + devMarcos.calcularTotalXp());

        System.out.println("_________________________________________________________________");

    }

}
