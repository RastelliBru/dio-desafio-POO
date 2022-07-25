package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("descrição curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBruna = new Dev();
        devBruna.setNome("Bruna");
        devBruna.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Bruna" + devBruna.getConteudosInscritos());
        devBruna.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Bruna" + devBruna.getConteudosInscritos());
        System.out.println("Conteudos concluidos Bruna" + devBruna.getConteudosConcluidos());
        System.out.println("XP:" + devBruna.calcularTotalXP());

        System.out.println("--------------------");

        Dev devKaue = new Dev();
        devKaue.setNome("Kaue");
        devKaue.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Kaue" + devKaue.getConteudosInscritos());
        devKaue.progredir();
        devKaue.progredir();
        devKaue.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Kaue" + devKaue.getConteudosInscritos());
        System.out.println("Conteudos concluidos Kaue" + devKaue.getConteudosConcluidos());
        System.out.println("XP:" + devKaue.calcularTotalXP());

    }
}
