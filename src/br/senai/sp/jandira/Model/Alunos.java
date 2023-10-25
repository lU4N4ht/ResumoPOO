package br.senai.sp.jandira.Model;

public class Alunos extends Pessoas{

    private int matricula;
    public Alunos (String nome, int idade, int matricula){
        //Trabalhar o construtor do pai
        super(nome, idade);

        this.matricula = matricula;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    //Sobrescrevendo
    @Override
    public void passatTempo() {
        System.out.println("O aluno está fazendo a atividade...");
    }
}