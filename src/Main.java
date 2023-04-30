import desafio.dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(mentoria1);
        System.out.println(curso2);

    }
}