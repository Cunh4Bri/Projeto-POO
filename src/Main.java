import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso");
        curso1.setCargaHoraria(50);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Como desenvolver Soft Skill");
        mentoria1.setDescricao("Descrição da mentoria");
        mentoria1.setData(LocalDate.now());

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Kotlin ");
        curso2.setDescricao("descrição curso");
        curso2.setCargaHoraria(40);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Dev");
        bootcamp.setDescricao("Descrição do Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devjoao = new Dev();
        devjoao.setNome("Joao");
        devjoao.inscrever(bootcamp);
        System.out.println("Conteúdos Inscritos João"+ devjoao.getConteudosInscrito());
        devjoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João"+ devjoao.getConteudosInscrito());
        System.out.println("Conteúdos Concluídos João"+ devjoao.getConteudosConcluido());
        System.out.println("XP: " +devjoao.calcularXpTotal());


        System.out.println("------------------------------");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        System.out.println("Conteúdos Inscritos Pedro" + devPedro.getConteudosInscrito());


    }
}