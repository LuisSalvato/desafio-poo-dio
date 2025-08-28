package br.com.desafio;

import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // 1. Criando Cursos e Mentorias
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        // 2. Criando um Bootcamp e adicionando os conteúdos
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        // 3. Criando um Dev e inscrevendo-o no bootcamp
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.seInscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de " + devJoao.getNome() + ": " + devJoao.getConteudosInscritos());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - -");

        // 4. Simular o progresso do Dev
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos Concluídos de " + devJoao.getNome() + ": " + devJoao.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos de " + devJoao.getNome() + ": " + devJoao.getConteudosInscritos());
        System.out.println("XP Total de " + devJoao.getNome() + ": " + devJoao.calcularTotalXp());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - -");

        // 5. Repetir o processo para outro Dev
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.seInscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de " + devCamila.getNome() + ": " + devCamila.getConteudosInscritos());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - -");

        devCamila.progredir();
        System.out.println("Conteúdos Concluídos de " + devCamila.getNome() + ": " + devCamila.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos de " + devCamila.getNome() + ": " + devCamila.getConteudosInscritos());
        System.out.println("XP Total de " + devCamila.getNome() + ": " + devCamila.calcularTotalXp());
    }
}