package br.senai.sp.jandira.Model;

public class Pessoas extends Conta{
    private String nome;
    private int idade;

    //Exemplo de polimorfismo
    public void passatTempo(){
        System.out.println("A pessoa está passando o tempo...");
    }
    public Pessoas(String nome, int idade){
        //Se refere a variável local
        this.nome = nome;
        this.idade = idade;
    }

    //Pega a variável
    public String getNome() {
        return nome;
    }

    //Configura a variável
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirInformacao(){
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(getSaldo());
    }
}
