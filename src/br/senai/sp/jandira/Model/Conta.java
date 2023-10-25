package br.senai.sp.jandira.Model;

//Abstração //Não pode mais ser instanciada
abstract class Conta {
    private double saldo = 1000000;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
