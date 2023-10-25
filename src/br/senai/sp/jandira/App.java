package br.senai.sp.jandira;

import br.senai.sp.jandira.Model.Alunos;
import br.senai.sp.jandira.Model.Pessoas;

public class App {
    public static void main(String[] args) {

        Pessoas pessoa1 = new Pessoas("Joao", 18);
        Pessoas pessoa2 = new Pessoas("Maria", 92);

        //Puxando uma varivável privada
        System.out.println("O nome é " + pessoa1.getNome());
        System.out.println("O nome é " + pessoa2.getNome());
        System.out.println("O nome é " + pessoa1.getIdade());
        System.out.println("O nome é " + pessoa2.getIdade());

        //Mudando o nome da variável pelo set
        pessoa1.setNome("Shakira Shakira");
        System.out.println("O nome é " + pessoa1.getNome());



        Pessoas aluno1 = new Alunos("Ximbinha", 17, 6666);

        System.out.println(aluno1.getNome() + aluno1.getIdade());

        //Exemplo polimorfismo
        aluno1.passatTempo();

        aluno1.exibirInformacao();

    }
}
