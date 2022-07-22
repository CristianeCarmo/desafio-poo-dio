package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCristiane = new Dev();
        devCristiane.setNome("Cristiane");
        devCristiane.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Cristiane: " + devCristiane.getConteudosInscritos());
        devCristiane.progredir();
        devCristiane.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Cristiane: " + devCristiane.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Cristiane: " + devCristiane.getConteudosConcluidos());
        System.out.println("XP: " + devCristiane.calcularTotalXp());

        System.out.println("--------");

        Dev devLaura = new Dev();
        devLaura.setNome("Laura");
        devLaura.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Laura: " + devLaura.getConteudosInscritos());
        devLaura.progredir();
        devLaura.progredir();
        devLaura.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Laura: " + devLaura.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Laura: " + devLaura.getConteudosConcluidos());
        System.out.println("XP: " + devLaura.calcularTotalXp());





    }
}
