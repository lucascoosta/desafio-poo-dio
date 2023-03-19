import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 =  new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 =  new Curso();
        curso2.setTitulo("Curso Angular");
        curso2.setDescricao("Descrição do curso Angular");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da mentoria de Java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Lucas " + devLucas.getConteudosInscritos());

        devLucas.progredir();
        devLucas.progredir();
        System.out.println("Conteúdos Inscritos Lucas " + devLucas.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Lucas " + devLucas.getConteudosConcluidos());
        System.out.println("XP " + devLucas.calcularTotalXp());

        System.out.println();
        Dev devEmily = new Dev();
        devEmily.setNome("Emily");
        devEmily.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Emily " + devEmily.getConteudosInscritos());

        devEmily.progredir();
        devEmily.progredir();
        devEmily.progredir();
        System.out.println("Conteúdos Inscritos Emily " + devEmily.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Emily " + devEmily.getConteudosConcluidos());
        System.out.println("XP " + devEmily.calcularTotalXp());

    }
}